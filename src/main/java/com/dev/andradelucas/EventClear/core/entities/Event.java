package com.dev.andradelucas.EventClear.core.entities;

import com.dev.andradelucas.EventClear.core.enums.TypeEvent;

import java.time.LocalDateTime;

public record Event(
        Long id,
        String name,
        String description,
        String identifier,
        LocalDateTime dataStart,
        String dataEnd,
        String location,
        Integer capacity,
        String organizer,
        TypeEvent type
) {}
