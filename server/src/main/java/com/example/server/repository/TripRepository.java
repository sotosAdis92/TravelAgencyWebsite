package com.example.server.repository;

import com.example.server.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
    List<Trip> findAllByCountry_Id(Long countryId);
    Optional<Trip> findById(Long id);
}
