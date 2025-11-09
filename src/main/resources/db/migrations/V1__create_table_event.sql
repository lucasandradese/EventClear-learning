-- V1__create_table_event

CREATE TABLE event_tb (
        id BIGSERIAL PRIMARY KEY,
        name VARCHAR(255) NOT NULL,
        description TEXT,
        identifier VARCHAR(25) NOT NULL UNIQUE,
        data_start TIMESTAMP NOT NULL,
        data_end TIMESTAMP NOT NULL,
        location VARCHAR(255) NOT NULL,
        capacity INTEGER NOT NULL,
        organizer VARCHAR(255) NOT NULL,
        type VARCHAR(50) NOT NULL
)