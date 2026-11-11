package com.example.server.repository;

import com.example.server.entity.Trip;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
    List<Trip> findAllByCountry_Name(String countryName);
    Optional<Trip> findById(Long id);

    @Query("FROM Trip t WHERE (t.cost > ?1  AND t.cost < ?2)")
    Page<Trip> filterTrips(double costMax, double costMin);
}
