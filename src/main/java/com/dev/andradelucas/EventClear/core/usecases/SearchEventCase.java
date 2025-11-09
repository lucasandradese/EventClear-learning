package com.dev.andradelucas.EventClear.core.usecases;
import com.dev.andradelucas.EventClear.core.entities.Event;
import java.util.List;

public interface SearchEventCase {
    public List<Event> execute();
}
