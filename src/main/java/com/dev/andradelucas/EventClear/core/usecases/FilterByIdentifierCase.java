package com.dev.andradelucas.EventClear.core.usecases;

import com.dev.andradelucas.EventClear.core.entities.Event;
import com.dev.andradelucas.EventClear.infrastructure.dtos.EventDto;

public interface FilterByIdentifierCase {
    public Event execute(String identifier);
}
