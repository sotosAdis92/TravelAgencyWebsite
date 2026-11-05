package com.example.server.mapper.impl;

import com.example.server.dto.request.TripRequest;
import com.example.server.dto.response.TripResponse;
import com.example.server.entity.*;
import com.example.server.mapper.TripMapper;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class TripMapperImpl implements TripMapper {

    @Override
    public Trip toEntity(TripRequest tripRequest, Country countryById) {
         Trip trip = new Trip(
                null,
                countryById,
                tripRequest.title(),
                tripRequest.duration(),
                tripRequest.tripCategory(),
                tripRequest.nights(),
                tripRequest.physicalCondition(),
                tripRequest.cost(),
                tripRequest.description(),
                tripRequest.imageMap(),
                tripRequest.imageUrl(),
                tripRequest.capacity(),
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>(),
                Instant.now(),
                Instant.now()
        );
        tripRequest.itineraries().stream().map(i -> {
            Itinerary itinerary = new Itinerary();
            itinerary.setDayNumber(i.dayNumber());
            itinerary.setLocation(i.location());
            itinerary.setDescription(i.description());
            itinerary.setImageUrl(i.imageUrl());
            return itinerary;
        }).forEach(trip::addItinerary);

        tripRequest.departures().stream().map(d -> {
            Departure departure = new Departure();
            departure.setDate(d.date());
            departure.setAirport(d.airport());
            departure.setTime(d.time());
            departure.setRoomType(d.roomType());
            return departure;
        }).forEach(trip::addDeparture);

        tripRequest.tripPictures().stream().map(tp -> {
            TripPicture tripPicture = new TripPicture();
            tripPicture.setImageUrl(tp.imageUrl());
            return tripPicture;
        }).forEach(trip::addTripPicture);

        return trip;
    }

    @Override
    public TripResponse toDto(Trip trip) {
        return null;
    }

    @Override
    public List<TripResponse> toDto(List<Trip> tripList) {
        return List.of();
    }
}
