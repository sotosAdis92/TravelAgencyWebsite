package com.example.server.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Table
public class TripPictures {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_id", nullable = false)
    private Trip trip;

    @Column(name = "url", nullable = false, updatable = true)
    private String imageUrl;

    @Column(name = "created_at", nullable = false)
    private Instant created_at;

    @Column(name = "updated_at")
    private Instant updated_at;
}
