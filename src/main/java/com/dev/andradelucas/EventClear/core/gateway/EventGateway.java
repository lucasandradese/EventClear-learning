package com.dev.andradelucas.EventClear.core.gateway;
import com.dev.andradelucas.EventClear.core.entities.Event;

public interface EventGateway {

    Event createEvent(Event event);
}
