package br.com.vicas.webfluxcourse.model.response;

public record UserResponse(
        String id,
        String name,
        String email,
        String password
) { }
