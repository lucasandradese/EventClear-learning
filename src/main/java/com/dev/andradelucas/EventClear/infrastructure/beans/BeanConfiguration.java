package com.dev.andradelucas.EventClear.infrastructure.beans;
import com.dev.andradelucas.EventClear.core.entities.Event;
import com.dev.andradelucas.EventClear.core.gateway.EventGateway;
import com.dev.andradelucas.EventClear.core.usecases.*;
import lombok.experimental.Delegate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateEventCase createEventCase (EventGateway eventGateway){
        return new CreateEventCaseImpl(eventGateway);
    }

    @Bean
    public SearchEventCase searchEventCase(EventGateway eventGateway){
        return new SearchEventCaseImpl(eventGateway);
    }

    @Bean
    public FilterByIdentifierCase filterByIdentifierCase(EventGateway eventGateway){
        return new FilterByIdentifierCaseImpl(eventGateway);
    }
}
