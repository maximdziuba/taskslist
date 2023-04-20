package com.example.tasklist.web.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class JwtRequest {

    @Schema(description = "User's username", example = "carl123")
    @NotNull(message = "Username must be not null")
    private String username;

    @Schema(description = "Password", example = "pass123")
    @NotNull(message = "Password must be not null")
    private String password;

}
