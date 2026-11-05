package com.example.server.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

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

    @Column(name = "created_at")
    private Instant created_at;

    @Column(name = "updated_at")
    private Instant updated_at;
}
