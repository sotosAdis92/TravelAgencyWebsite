package com.example.server.controller;

import com.example.server.dto.response.CountryResponse;
import com.example.server.service.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/country")
public class CountryController {
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/{continentId}")
    public ResponseEntity<List<CountryResponse>> getAllCountries(@PathVariable("continentId") Long continentId){
        List<CountryResponse> countries = countryService.getAllCounties(continentId);
        return new ResponseEntity<>(countries, HttpStatus.OK);
    }
}
