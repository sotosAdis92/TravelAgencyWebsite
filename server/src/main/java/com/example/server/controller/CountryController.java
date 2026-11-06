package com.example.server.controller;

import com.example.server.dto.response.CountryResponse;
import com.example.server.service.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping
    public ResponseEntity<List<CountryResponse>> getAllCountries(){
        List<CountryResponse> counties = countryService.getAllCounties();
        return new ResponseEntity<>(counties, HttpStatus.OK);
    }
}
