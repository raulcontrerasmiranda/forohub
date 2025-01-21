package com.alura.forohub.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor // Genera un constructor con todos los argumentos
public class AuthResponse {
    private String token;
}