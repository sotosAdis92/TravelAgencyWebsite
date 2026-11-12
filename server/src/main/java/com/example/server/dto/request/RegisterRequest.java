package com.example.server.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record RegisterRequest(
        @NotNull(message = "Password needs to be set to create user account")
        @Size(min = 4,max = 255)
        String username,
        @NotNull(message = "Password needs to be set to create user account")
        @Size(min = 5, message = "Password should be more than 4 characters long")
        String password
) {
}
