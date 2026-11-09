package com.example.server.controller;

import com.example.server.dto.response.BookingResponse;
import com.example.server.entity.User;
import com.example.server.service.BookingService;
import com.example.server.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/booking")
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
}
