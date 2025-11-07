package com.dev.andradelucas.EventClear.infrastructure.mapper;
import com.dev.andradelucas.EventClear.core.entities.Event;
import com.dev.andradelucas.EventClear.infrastructure.persistence.EventEntity;
import org.springframework.stereotype.Component;

@Component
public class EventEntityMapper {

    public EventEntity toEntity(Event event){
        return new EventEntity(
                event.id(),
                event.name(),
                event.description(),
                event.identifier(),
                event.dataStart(),
                event.dataEnd(),
                event.location(),
                event.capacity(),
                event.organizer(),
                event.type()
        );
    }

    public Event toDomain(EventEntity eventEntity){
        return new Event(
                eventEntity.getId(),
                eventEntity.getName(),
                eventEntity.getDescription(),
                eventEntity.getIdentifier(),
                eventEntity.getDataStart(),
                eventEntity.getDataEnd(),
                eventEntity.getLocation(),
                eventEntity.getCapacity(),
                eventEntity.getOrganizer(),
                eventEntity.getType()
        );
    }
}
