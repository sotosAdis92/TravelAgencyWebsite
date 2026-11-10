package com.example.server.controller;

import com.example.server.dto.request.BookingRequest;
import com.example.server.dto.response.BookingResponse;
import com.example.server.entity.User;
import com.example.server.service.BookingService;
import com.example.server.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bookings")
public class BookingController {
    private final BookingService bookingService;
    private final UserService userService;

    public BookingController(BookingService bookingService, UserService userService) {
        this.bookingService = bookingService;
        this.userService = userService;
    }

    @GetMapping("/my-bookings")
    public ResponseEntity<List<BookingResponse>> getUserBookings(@AuthenticationPrincipal UserDetails userDetails){
        User user = userService.getUserFromUsername(userDetails.getUsername());
        List<BookingResponse> bookingResponses = bookingService.findByUser(user);
        return new ResponseEntity<>(bookingResponses,HttpStatus.OK);
    }

    @DeleteMapping("/my-bookings/{id}")
    public ResponseEntity<String> deleteBooking(@PathVariable("id") Long id, @AuthenticationPrincipal UserDetails userDetails){
        User user = userService.getUserFromUsername(userDetails.getUsername());
        bookingService.deleteBooking(id,user);
        return new ResponseEntity<>("Deleted the booking", HttpStatus.NO_CONTENT);
    }

    @PostMapping
    public ResponseEntity<BookingResponse> makeBooking(@AuthenticationPrincipal UserDetails userDetails, @RequestBody BookingRequest bookingRequest){
        User user = userService.getUserFromUsername(userDetails.getUsername());
        BookingResponse bookingResponse = bookingService.makeBooking(user, bookingRequest);
        return new ResponseEntity<>(bookingResponse,HttpStatus.OK);
    }

}
