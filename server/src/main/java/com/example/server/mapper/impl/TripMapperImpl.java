package com.example.server.mapper.impl;

import com.example.server.dto.request.TripRequest;
import com.example.server.dto.response.DepartureResponse;
import com.example.server.dto.response.ItineraryResponse;
import com.example.server.dto.response.TripPictureResponse;
import com.example.server.dto.response.TripResponse;
import com.example.server.entity.*;
import com.example.server.mapper.TripMapper;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Component
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
        List<ItineraryResponse> itineraries = trip.getItineraries().stream().map(itinerary ->
            new ItineraryResponse(
                    itinerary.getId(),
                    itinerary.getTrip().getId(),
                    itinerary.getDayNumber(),
                    itinerary.getLocation(),
                    itinerary.getDescription(),
                    itinerary.getImageUrl()
            )).toList();

        List<DepartureResponse> departures = trip.getDepartures().stream().map(departure ->
                new DepartureResponse(
                        departure.getId(),
                        departure.getTrip().getId(),
                        departure.getDate(),
                        departure.getAirport(),
                        departure.getTime(),
                        departure.getRoomType()
                )).toList();

        List<TripPictureResponse> tripPictures = trip.getTripPictures().stream().map(itinerary ->
                new TripPictureResponse(
                        itinerary.getId(),
                        itinerary.getTrip().getId(),
                        itinerary.getImageUrl()
                )).toList();

        TripResponse tripResponse = new TripResponse(
                trip.getId(),
                trip.getCountry().getId(),
                trip.getTitle(),
                trip.getDuration(),
                trip.getCategory(),
                trip.getNights(),
                trip.getPhysicalCondition(),
                trip.getCost(),
                trip.getDescription(),
                trip.getImageMap(),
                trip.getImageUrl(),
                trip.getCapacity(),
                itineraries,
                departures,
                tripPictures
        );
        return tripResponse;
    }

    @Override
    public List<TripResponse> toDto(List<Trip> tripList) {
        return tripList.stream().map(this::toDto).toList();
    }
}
