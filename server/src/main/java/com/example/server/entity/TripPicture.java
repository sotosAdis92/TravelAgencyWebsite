package com.example.server.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Getter
@Setter
@Table(name = "trip_picture")
@NoArgsConstructor
@AllArgsConstructor
public class TripPicture {
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
}
