package com.example.calculator.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class PasswordResetDto {

    private String password;
    private String confirmPassword;
    private String token;
}
