package com.example.server.dto.request;

public record LoginRequest(
        String username,
        String password
) {
}
