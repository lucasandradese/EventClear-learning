package com.dev.andradelucas.EventClear.core.usecases;

import com.dev.andradelucas.EventClear.core.entities.Event;
import com.dev.andradelucas.EventClear.core.gateway.EventGateway;
import com.dev.andradelucas.EventClear.infrastructure.exception.DuplicateEventException;


public class CreateEventCaseImpl implements CreateEventCase {

    private final EventGateway eventGateway;
    public CreateEventCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(Event event){
        if(eventGateway.existIdentifier(event.identifier())){
            throw new DuplicateEventException("The identifier which cod: " + event.identifier() + " is already in use for another event.");
        }
        return eventGateway.createEvent(event);
    };
}
