package com.example.server.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record LoginRequest(
        @NotBlank(message = "Username cannot be null or blank")
        @Size(min = 4,max = 255, message = "Username is not within correct bounds, send again")
        String username,
        @NotBlank(message = "Password cannot be null or blank")
        @Size(min = 4, message = "Size of password needs to be longer")
        String password
) {
}
