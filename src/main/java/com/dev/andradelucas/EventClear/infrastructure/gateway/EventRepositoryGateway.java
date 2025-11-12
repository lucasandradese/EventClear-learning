package com.dev.andradelucas.EventClear.infrastructure.gateway;

import com.dev.andradelucas.EventClear.core.entities.Event;
import com.dev.andradelucas.EventClear.core.gateway.EventGateway;
import com.dev.andradelucas.EventClear.infrastructure.mapper.EventEntityMapper;
import com.dev.andradelucas.EventClear.infrastructure.persistence.EventEntity;
import com.dev.andradelucas.EventClear.infrastructure.persistence.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class EventRepositoryGateway implements EventGateway {

    private final EventRepository eventRepository;
    private final EventEntityMapper mapper;

    @Override
    public Event createEvent(Event event) {
        EventEntity entity = mapper.toEntity(event);
        EventEntity newEvent = eventRepository.save(entity);
        return mapper.toDomain(newEvent);
    }

    @Override
    public List<Event> seachEvent() {
        return eventRepository.findAll().stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public boolean existIdentifier(String identifier) {
        return eventRepository.findAll().stream()
                .anyMatch(event -> event.getIdentifier().equalsIgnoreCase(identifier));
    }

    @Override
    public Optional<Event> filterByIdentifier(String identifier) {
        return eventRepository.findByIdentifier(identifier);
    }
}
