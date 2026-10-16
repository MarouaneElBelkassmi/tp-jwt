package com.elbelkassmi.tp_jwt.dto;

public record LoginRequest(
        String email,
        String password
) {
}
