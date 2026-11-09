package com.example.server.controller;

import com.example.server.dto.request.TripRequest;
import com.example.server.dto.response.TripResponse;
import com.example.server.service.TripService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trip")
public class TripController {
    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping("/country/{countryId}")
    public ResponseEntity<List<TripResponse>> getTripsByCountry(@PathVariable("countryId") Long countryId){
        List<TripResponse> trips = tripService.getTripsByCountry(countryId);
        return new ResponseEntity<>(trips, HttpStatus.OK);
    }
}
