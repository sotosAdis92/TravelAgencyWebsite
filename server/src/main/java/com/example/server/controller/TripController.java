package com.example.server.controller;

import com.example.server.dto.response.TripResponse;
import com.example.server.service.TripService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/trips")
public class TripController {
    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping
    public ResponseEntity<Page<TripResponse>> getTripsByCountry(
            @RequestParam(required = true) String countryName,
            @RequestParam(required = false, name = "costMin") double costMin,
            @RequestParam(required = false, name = "costMax") double costMax,
            @RequestParam(required = false, name = "category") String category,
            @RequestParam(required = false, name = "durationMin") double durationMin,
            @RequestParam(required = false, name = "durationMax") double durationMax,
            @RequestParam(required = false, name = "pageNo", defaultValue = "1") int pageNo,
            @RequestParam(required = false, name = "pageSize", defaultValue = "10") int pageSize
    ){
        Page<TripResponse> trips = tripService.getTripsByCountryName(countryName,costMin,costMax,category,durationMin,durationMax, PageRequest.of(pageNo-1,pageSize));
        return new ResponseEntity<>(trips, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TripResponse> getTrip(@PathVariable("id") Long id){
        TripResponse trip = tripService.findById(id);
        return new ResponseEntity<>(trip, HttpStatus.OK);
    }
}
