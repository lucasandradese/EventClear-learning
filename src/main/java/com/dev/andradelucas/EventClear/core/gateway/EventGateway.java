package com.dev.andradelucas.EventClear.core.gateway;
import com.dev.andradelucas.EventClear.core.entities.Event;
import java.util.List;

public interface EventGateway {
    Event createEvent(Event event);
    List<Event> seachEvent();
}
