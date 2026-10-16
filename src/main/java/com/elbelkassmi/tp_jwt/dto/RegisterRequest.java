package com.elbelkassmi.tp_jwt.dto;

public record RegisterRequest(
        String email,
        String password
) {
}
