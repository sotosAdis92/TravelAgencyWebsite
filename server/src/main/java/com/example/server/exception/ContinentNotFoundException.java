package com.example.server.exception;

public class ContinentNotFoundException extends RuntimeException {
    public ContinentNotFoundException(String message) {
        super(message);
    }
}
