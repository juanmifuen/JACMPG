package com.Hotel.Hotel.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {

    @NotBlank(message = "Email requerido")
    private String email;

    @NotBlank(message = "Password requerida")
    private String password;
}
