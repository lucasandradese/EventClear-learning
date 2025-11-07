package com.dev.andradelucas.EventClear.core.usecases;

import com.dev.andradelucas.EventClear.core.entities.Event;
import com.dev.andradelucas.EventClear.core.gateway.EventGateway;

public class CreateEventCaseImpl implements CreateEventCase {

    private final EventGateway eventGateway;

    public CreateEventCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(Event event){
        return null;
    };
}
