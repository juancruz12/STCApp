package com.programandoenjava.jwt.auth.controller;

import com.programandoenjava.jwt.enums.Role;

public record RegisterRequest(
        String name,
        String email,
        String password,
        Role role
) {
}
