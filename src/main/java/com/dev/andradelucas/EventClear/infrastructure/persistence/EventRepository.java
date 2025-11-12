package com.dev.andradelucas.EventClear.infrastructure.persistence;

import com.dev.andradelucas.EventClear.core.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventRepository extends JpaRepository<EventEntity, Long>{

    Optional<Event> findByIdentifier(String identifier);
}
