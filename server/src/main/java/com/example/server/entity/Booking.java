package com.example.server.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Table(name = "bookings")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false,updatable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_id", nullable = false)
    private Trip trip;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "booked_at", nullable = false)
    private Instant bookedAt;

    public Booking(Long id, Trip trip, User user, Instant bookedAt) {
        this.id = id;
        this.trip = trip;
        this.user = user;
        this.bookedAt = bookedAt;
    }
}
