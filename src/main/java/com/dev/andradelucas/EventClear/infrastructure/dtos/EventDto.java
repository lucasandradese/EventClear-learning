package com.dev.andradelucas.EventClear.infrastructure.dtos;

import com.dev.andradelucas.EventClear.core.enums.EventType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDateTime;

public record EventDto (
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
){}
