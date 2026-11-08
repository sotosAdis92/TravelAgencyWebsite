package com.example.server.dto.request;

public record RegisterRequest(
        String username,
        String password
) {
}
