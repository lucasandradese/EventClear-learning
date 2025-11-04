package com.dev.andradelucas.EventClear.infrastructure.persistence;

import com.dev.andradelucas.EventClear.core.enums.EventType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "event_tb")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String identifier;
    private LocalDateTime dataStart;
    private String dataEnd;
    private String location;
    private Integer capacity;
    private String organizer;
    private EventType type;
}
