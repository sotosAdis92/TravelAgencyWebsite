package com.example.server.controller;

import com.example.server.dto.request.CountryRequest;
import com.example.server.dto.response.CountryResponse;
import com.example.server.entity.Country;
import com.example.server.service.CountryService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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

    @ApiResponse(responseCode = "200",description = "List of countries by continent with id", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = CountryResponse.class))})
    @GetMapping("/continent/{continentId}")
    public ResponseEntity<List<CountryResponse>> getAllCountriesByContinentId(@PathVariable("continentId") Long continentId){
        List<CountryResponse> countries = countryService.getAllCountriesByContinent(continentId);
        return new ResponseEntity<>(countries, HttpStatus.OK);
    }
}
