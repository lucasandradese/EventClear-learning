package com.dev.andradelucas.EventClear.core.usecases;
import com.dev.andradelucas.EventClear.core.entities.Event;
import com.dev.andradelucas.EventClear.core.gateway.EventGateway;

import java.util.List;

public class SearchEventCaseImpl implements SearchEventCase {

    public final EventGateway eventGateway;
    public SearchEventCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public List<Event> execute() {
        return eventGateway.seachEvent();
    }
}
