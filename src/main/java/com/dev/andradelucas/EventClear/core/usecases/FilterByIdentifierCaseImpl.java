package com.dev.andradelucas.EventClear.core.usecases;
import com.dev.andradelucas.EventClear.core.entities.Event;
import com.dev.andradelucas.EventClear.core.gateway.EventGateway;
import com.dev.andradelucas.EventClear.infrastructure.exception.NotFountEventException;

public class FilterByIdentifierCaseImpl implements FilterByIdentifierCase{

    private final EventGateway eventGateway;

    public FilterByIdentifierCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(String identifier) {
        return eventGateway.filterByIdentifier(identifier)
                .orElseThrow(()-> new NotFountEventException("Event with identifier: " + identifier + " not exist."));
    }
}
