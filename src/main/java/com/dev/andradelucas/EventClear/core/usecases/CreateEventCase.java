package com.dev.andradelucas.EventClear.core.usecases;

import com.dev.andradelucas.EventClear.core.entities.Event;

public interface CreateEventCase {
    public Event execute(Event event);
}
