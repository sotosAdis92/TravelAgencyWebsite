package com.example.server.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Table(name = "trips")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false,updatable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "duration",nullable = false)
    private int duration;

    @Column(name = "category", nullable = false)
    private Enumerated category;

    @Column(name = "nights",nullable = false)
    private int nights;

    @Column(name = "physical_condition",nullable = false)
    private Enumerated physicalCondition;

    @Column(name = "cost",nullable = false)
    private int cost;

    @Column(name = "description",nullable = false)
    private String description;

    @Column(name = "map_image", nullable = false)
    private String imageMap;

    @Column(name = "picture", nullable = false)
    private String imageUrl;

    @Column(name = "capacity", nullable = false)
    private int capacity;

    @Column(name = "created_at")
    private Instant created_at;

    @Column(name = "updated_at")
    private Instant updated_at;
}
