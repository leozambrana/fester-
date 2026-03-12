package com.festere.api.domain.address;

import com.festere.api.domain.event.Event;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue
    private UUID id;

    private String cidade;
    private String uf;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}
