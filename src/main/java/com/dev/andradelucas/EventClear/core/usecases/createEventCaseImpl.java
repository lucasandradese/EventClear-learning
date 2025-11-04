package com.dev.andradelucas.EventClear.core.usecases;

import com.dev.andradelucas.EventClear.core.entities.Event;

public class createEventCaseImpl implements createEventCase{

    @Override
    public Event execute(Event event){
        return event;
    };
}
