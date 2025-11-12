package com.dev.andradelucas.EventClear.core.usecases;

import com.dev.andradelucas.EventClear.core.entities.Event;

public interface FilterByIdentifierCase {
    public Event execute(String identifier);
}
