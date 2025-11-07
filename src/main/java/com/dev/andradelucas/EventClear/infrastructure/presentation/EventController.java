package com.dev.andradelucas.EventClear.infrastructure.presentation;

import com.dev.andradelucas.EventClear.core.entities.Event;
import com.dev.andradelucas.EventClear.core.usecases.CreateEventCase;
import com.dev.andradelucas.EventClear.infrastructure.dtos.EventDto;
import com.dev.andradelucas.EventClear.infrastructure.mapper.EventDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/event/v1/")
public class EventController {

    private final CreateEventCase createEventCase;
    private final EventDtoMapper eventDtoMapper;

    public EventController(CreateEventCase createEventCase, EventDtoMapper eventDtoMapper) {
        this.createEventCase = createEventCase;
        this.eventDtoMapper = eventDtoMapper;
    }

    @PostMapping("create")
    public EventDto createEvent(@RequestBody EventDto eventDto){
        Event newEvent = createEventCase.execute(eventDtoMapper.toEntity(eventDto));
        return eventDtoMapper.toDto(newEvent);
    }

    @GetMapping("search")
    public String searchEvent(){
        return "Lista de eventos";
    }
}
