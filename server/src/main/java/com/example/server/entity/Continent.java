package com.example.server.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Table(name = "continents")
public class Continent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",updatable = false,nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "population", nullable = false)
    private int population;

    @Column(name = "land_area", nullable = false)
    private int landArea;

    @Column(name = "picture", nullable = false)
    private String imageUrl;

    @Column(name = "map",nullable = false)
    private String mapUrl;

    @Column(name = "created_at")
    private Instant created_at;

    @Column(name = "updated_at")
    private Instant updated_at;
}
