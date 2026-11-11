package com.example.server.service;


import com.example.server.dto.response.TripResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface TripService {
    Page<TripResponse> getTripsByCountryName(String countryName, double costMin, double costMax, String category, double durationMin, double durationMax, Pageable pageable);
    TripResponse findById(Long Id);
}
