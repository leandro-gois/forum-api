package com.leandro.Forum_Hub.domain;

import jakarta.validation.constraints.NotBlank;

public record DadosAutenticacao(
        @NotBlank
        String email,

        @NotBlank
        String senha) {
}