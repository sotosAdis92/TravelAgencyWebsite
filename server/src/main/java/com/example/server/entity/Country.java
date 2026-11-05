package com.example.server.entity;

import jakarta.persistence.*;

@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false,updatable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "continent_id")
    private Continent continent;
}
