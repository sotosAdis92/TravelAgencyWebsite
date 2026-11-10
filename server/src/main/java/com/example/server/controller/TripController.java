package com.example.server.controller;

import com.example.server.dto.response.TripResponse;
import com.example.server.service.TripService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trips")
public class TripController {
    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping
    public ResponseEntity<List<TripResponse>> getTripsByCountry(
            @RequestParam(required = true) String countryName,
            @RequestParam(required = false) int costMin,
            @RequestParam(required = false) int costMax,
            @RequestParam(required = false) String category,
            @RequestParam(required = false) int durationMin,
            @RequestParam(required = false) int durationMax
    ){
        List<TripResponse> trips = tripService.getTripsByCountryName(countryName);
        return new ResponseEntity<>(trips, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TripResponse> getTrip(@PathVariable("id") Long id){
        TripResponse trip = tripService.findById(id);
        return new ResponseEntity<>(trip, HttpStatus.OK);
    }
}
