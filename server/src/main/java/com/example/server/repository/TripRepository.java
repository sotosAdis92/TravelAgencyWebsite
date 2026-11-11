package com.example.server.repository;

import com.example.server.entity.Trip;
import com.example.server.enums.TripCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
    List<Trip> findAllByCountry_Name(String countryName);
    Optional<Trip> findById(Long id);
    @Query("SELECT DISTINCT t FROM Trip t  WHERE (?1 IS NULL OR t.country.name = ?1) AND (?2 IS NULL OR t.cost <= ?2) AND (?3 IS NULL OR t.cost >= ?3) AND (?5 IS NULL OR t.duration >= ?5 ) AND (?6 IS NULL OR t.duration < ?6) AND (?4 IS NULL OR t.category = ?4)")
    Page<Trip> filterTrips(String countryName,Double costMax,Double costMin,TripCategory category,Double durationMin,Double durationMax, Pageable pageable);
}
