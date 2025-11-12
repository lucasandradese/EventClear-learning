package com.dev.andradelucas.EventClear.core.gateway;
import com.dev.andradelucas.EventClear.core.entities.Event;
import java.util.List;
import java.util.Optional;

public interface EventGateway {
    Event createEvent(Event event);
    List<Event> seachEvent();
    Optional<Event> filterByIdentifier(String identifier);
    boolean existIdentifier(String identifier);
}
