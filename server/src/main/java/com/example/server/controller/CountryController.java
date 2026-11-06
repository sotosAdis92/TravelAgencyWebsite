package com.example.server.controller;

import com.example.server.dto.request.CountryRequest;
import com.example.server.dto.response.CountryResponse;
import com.example.server.service.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/country")
public class CountryController {
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/continent/{continentId}")
    public ResponseEntity<List<CountryResponse>> getAllCountriesByContinentId(@PathVariable("continentId") Long continentId){
        List<CountryResponse> countries = countryService.getAllCountriesByContinent(continentId);
        return new ResponseEntity<>(countries, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CountryResponse> createCountry(@RequestBody CountryRequest countryRequest){
        CountryResponse country = countryService.createCountry(countryRequest);
        return new ResponseEntity<>(country,HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CountryResponse> updateCountry(@RequestBody CountryRequest countryRequest, @PathVariable("id") Long id){
        CountryResponse country = countryService.updateCountry(countryRequest, id);
        return new ResponseEntity<>(country,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCountry(@PathVariable("id") Long id){
        countryService.deleteCountry(id);
        return new ResponseEntity<>("Deleted the country with an id of:" + id, HttpStatus.OK);
    }
}
