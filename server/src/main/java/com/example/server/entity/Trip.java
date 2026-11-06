package com.example.server.entity;

import com.example.server.enums.PhysicalConditions;
import com.example.server.enums.TripCategory;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "trip")
@NoArgsConstructor
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
    @Enumerated(EnumType.STRING)
    private TripCategory category;

    @Column(name = "nights",nullable = false)
    private int nights;

    @Column(name = "physical_condition",nullable = false)
    @Enumerated(EnumType.STRING)
    private PhysicalConditions physicalCondition;

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

    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Itinerary> itineraries = new ArrayList<>();

    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Departure> departures = new ArrayList<>();

    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TripPicture> tripPictures = new ArrayList<>();

    @Column(name = "created_at")
    private Instant created_at;

    @Column(name = "updated_at")
    private Instant updated_at;

    public Trip(Long id, Country country, String title, int duration, TripCategory category, int nights,
                PhysicalConditions physicalCondition, int cost, String description, String imageMap,
                String imageUrl, int capacity, List<Itinerary> itineraries, List<Departure> departures,
                List<TripPicture> tripPictures, Instant created_at, Instant updated_at)
    {
        this.id = id;
        this.country = country;
        this.title = title;
        this.duration = duration;
        this.category = category;
        this.nights = nights;
        this.physicalCondition = physicalCondition;
        this.cost = cost;
        this.description = description;
        this.imageMap = imageMap;
        this.imageUrl = imageUrl;
        this.capacity = capacity;
        this.itineraries = itineraries;
        this.departures = departures;
        this.tripPictures = tripPictures;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public void addItinerary(Itinerary itinerary){
        itineraries.add(itinerary);
        itinerary.setTrip(this);
    }

    public void addDeparture(Departure departure){
        departures.add(departure);
        departure.setTrip(this);
    }

    public void addTripPicture(TripPicture tripPicture){
        tripPictures.add(tripPicture);
        tripPicture.setTrip(this);
    }
}
