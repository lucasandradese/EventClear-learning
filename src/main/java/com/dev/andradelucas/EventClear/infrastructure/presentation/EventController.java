package com.dev.andradelucas.EventClear.infrastructure.presentation;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/event/v1")
public class EventController {

    @PostMapping("/create")
    public String createEvent(){
        return "Evento Criado";
    }
}
