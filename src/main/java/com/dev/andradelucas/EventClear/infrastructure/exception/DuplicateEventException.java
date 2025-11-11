package com.dev.andradelucas.EventClear.infrastructure.exception;

public class DuplicateEventException extends RuntimeException {

    public DuplicateEventException(String message){
        super(message);
    }

}
