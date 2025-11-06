package com.dev.andradelucas.EventClear.infrastructure.mapper;

import com.dev.andradelucas.EventClear.core.entities.Event;
import com.dev.andradelucas.EventClear.infrastructure.dtos.EventDto;
import org.springframework.stereotype.Component;

@Component
public class EventDtoMapper {

    public Event toEntity(EventDto eventDto){
        return new Event(
                eventDto.id(),
                eventDto.name(),
                eventDto.description(),
                eventDto.identifier(),
                eventDto.dataStart(),
                eventDto.dataEnd(),
                eventDto.location(),
                eventDto.capacity(),
                eventDto.organizer(),
                eventDto.type()
        );
    }

    public EventDto toDto(Event event){
        return new EventDto(
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

}
