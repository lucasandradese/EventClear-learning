package com.dev.andradelucas.EventClear.infrastructure.presentation;

import com.dev.andradelucas.EventClear.core.entities.Event;
import com.dev.andradelucas.EventClear.core.usecases.CreateEventCase;
import com.dev.andradelucas.EventClear.core.usecases.FilterByIdentifierCase;
import com.dev.andradelucas.EventClear.core.usecases.SearchEventCase;
import com.dev.andradelucas.EventClear.infrastructure.dtos.EventDto;
import com.dev.andradelucas.EventClear.infrastructure.mapper.EventDtoMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/event/v1/")
public class EventController {

    private final CreateEventCase createEventCase;
    private final EventDtoMapper eventDtoMapper;
    private final SearchEventCase searchEventCase;
    private final FilterByIdentifierCase filterByIdentifierCase;

    public EventController(CreateEventCase createEventCase, EventDtoMapper eventDtoMapper, SearchEventCase searchEventCase, FilterByIdentifierCase filterByIdentifierCase) {
        this.createEventCase = createEventCase;
        this.eventDtoMapper = eventDtoMapper;
        this.searchEventCase = searchEventCase;
        this.filterByIdentifierCase = filterByIdentifierCase;
    }

    @PostMapping("create")
    public ResponseEntity<Map<String, Object>> createEvent(@RequestBody EventDto eventDto){
        Event newEvent = createEventCase.execute(eventDtoMapper.toEntity(eventDto));
        Map<String, Object> response = new HashMap<>();
        response.put("message: ", "Event registration success in the database.");
        response.put("data: ", eventDtoMapper.toDto(newEvent));
        return ResponseEntity.ok(response);
    }

    @GetMapping("search")
    public List<EventDto> searchEvent(){
        return  searchEventCase.execute().stream().
                map(eventDtoMapper::toDto)
                .collect(Collectors.toList());
    }
    @GetMapping("filter/{identifier}")
    public ResponseEntity<EventDto> filterIdentifierEvent(@PathVariable String identifier){
        Event event = filterByIdentifierCase.execute(identifier);
        return ResponseEntity.ok(eventDtoMapper.toDto(event));
    }
}
