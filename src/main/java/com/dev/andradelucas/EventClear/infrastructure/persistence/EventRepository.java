package com.dev.andradelucas.EventClear.infrastructure.persistence;

import com.dev.andradelucas.EventClear.core.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventEntity, Long>{
}
