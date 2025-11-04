package com.dev.andradelucas.EventClear.core.entities;

import com.dev.andradelucas.EventClear.core.enums.EventType;

import java.time.LocalDateTime;

public record Event(
        Long id,
        String name,
        String description,
        String identifier,
        LocalDateTime dataStart,
        LocalDateTime dataEnd,
        String location,
        Integer capacity,
        String organizer,
        EventType type
) {}
