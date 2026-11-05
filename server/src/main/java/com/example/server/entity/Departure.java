package com.example.server.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@Table
public class Departure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_id", nullable = false)
    private Trip trip;

    @Column(name = "date", nullable = false,updatable = true)
    private LocalDate date;

    @Column(name = "airport", nullable = false, updatable = true)
    private String airport;

    @Column(name = "time", nullable = false)
    private LocalTime time;

    @Column(name = "room_type", nullable = false)
    private Enumerated roomType;

    @Column(name = "created_at", nullable = false)
    private Instant created_at;

    @Column(name = "updated_at")
    private Instant updated_at;
}
