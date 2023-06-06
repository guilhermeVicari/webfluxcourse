package br.com.vicas.webfluxcourse.model.request;

public record UserRequest(
        String name,
        String email,
        String password
) { }
