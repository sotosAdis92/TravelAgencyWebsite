package com.example.server.entity;

import com.example.server.enums.ContinentNames;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Formula;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Table(name = "continents")
public class Continent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",updatable = false,nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    @Enumerated(EnumType.STRING)
    private ContinentNames name;

    @Column(name = "population", nullable = false)
    private int population;

    @Column(name = "land_area", nullable = false)
    private int landArea;

    @Column(name = "picture", nullable = false)
    private String imageUrl;

    @Column(name = "map",nullable = false)
    private String mapUrl;

    @OneToMany(mappedBy = "continent", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Country> countries = new ArrayList<>();

    @Formula("select count(*) from countries c where c.continent_id = id")
    private long countryCount;

    @Column(name = "created_at")
    private Instant created_at;

    @Column(name = "updated_at")
    private Instant updated_at;
}
