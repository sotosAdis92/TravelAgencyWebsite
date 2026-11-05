package com.example.server.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false,updatable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "continent_id")
    private Continent continent;

    @Column(name = "name", nullable = false,updatable = true)
    private String name;

    @Column(name = "population", nullable = false, updatable = true)
    private int population;

    @Column(name = "country_picture", nullable = false, updatable = true)
    private String imageUrl;

    @Column(name = "country_map", nullable = false, updatable = true)
    private String mapUrl;

    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Trip> trips = new ArrayList<>();

    @Column(name = "created_at")
    private Instant created_at;

    @Column(name = "updated_at")
    private Instant updated_at;

    public Country(Long id, Continent continent, String name, int population, String imageUrl, String mapUrl, List<Trip> trips, Instant created_at, Instant updated_at) {
        this.id = id;
        this.continent = continent;
        this.name = name;
        this.population = population;
        this.imageUrl = imageUrl;
        this.mapUrl = mapUrl;
        this.trips = trips;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
}
