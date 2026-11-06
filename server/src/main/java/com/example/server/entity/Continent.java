package com.example.server.entity;

import com.example.server.enums.ContinentNames;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Formula;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "continent")
@NoArgsConstructor
@AllArgsConstructor
public class Continent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",updatable = false,nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    @Enumerated(EnumType.STRING)
    private ContinentNames name;

    @Column(name = "population", nullable = false)
    private Long population;

    @Column(name = "land_area", nullable = false)
    private int landArea;

    @Column(name = "picture")
    private String imageUrl;

    @Column(name = "map")
    private String mapUrl;

    @OneToMany(mappedBy = "continent", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Country> countries = new ArrayList<>();

    @Column(name = "created_at")
    private Instant created_at;

    @Column(name = "updated_at")
    private Instant updated_at;

    public Continent(Long id, ContinentNames name, Long population, int landArea, String imageUrl, String mapUrl, Instant created_at, Instant updated_at) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.landArea = landArea;
        this.imageUrl = imageUrl;
        this.mapUrl = mapUrl;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
}
