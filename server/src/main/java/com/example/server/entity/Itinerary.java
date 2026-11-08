package com.example.server.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "itinerary")
@Setter
@Getter
public class Itinerary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_id", nullable = false)
    private Trip trip;

    @Column(name = "day_number", nullable = false)
    private int dayNumber;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "picture")
    private String imageUrl;

    @Column(name = "created_at")
    private Instant created_at;
}
