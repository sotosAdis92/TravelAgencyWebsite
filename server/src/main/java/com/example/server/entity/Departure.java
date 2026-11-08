package com.example.server.entity;

import com.example.server.enums.RoomType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Setter
@Getter
@Table(name = "departure")
@NoArgsConstructor
@AllArgsConstructor
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

    @Column(name = "room_type")
    @Enumerated(EnumType.STRING)
    private RoomType roomType;

    @Column(name = "created_at")
    private Instant created_at;
}
