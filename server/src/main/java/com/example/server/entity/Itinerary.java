package com.example.server.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Table
@Setter
@Getter
public class Itinerary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "trip_id")
    private Trip trip;

    @Column(name = "day_number", nullable = false)
    private int dayNumber;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "picture")
    private String imageUrl;

    @Column(name = "created_at", nullable = false)
    private Instant created_at;

    @Column(name = "updated_at")
    private Instant updated_at;
}
