package com.dev.andradelucas.EventClear.infrastructure.gateway;

import com.dev.andradelucas.EventClear.core.entities.Event;
import com.dev.andradelucas.EventClear.core.gateway.EventGateway;
import com.dev.andradelucas.EventClear.infrastructure.mapper.EventEntityMapper;
import com.dev.andradelucas.EventClear.infrastructure.persistence.EventEntity;
import com.dev.andradelucas.EventClear.infrastructure.persistence.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

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
}
