package com.example.tasklist.web.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class JwtResponse {

    @Schema(description = "User's id", example = "1")
    private Long id;

    @Schema(description = "User's username", example = "carl123")
    private String username;

    @Schema(description = "Access token", example = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqb2huZG9lQGdtYWlsLmNvbSIsImlkIjoxLCJyb2xlcyI6WyJST0xFX0FETUlOIiwiUk9MRV9VU0VSIl0sImlhdCI6MTY4MjAxNjc1NywiZXhwIjoxNjgyMDE3MTE3fQ.fajfktDIgj4LOl1pk-HicUMcjQArq3kIsR2nx74jwk8VMujlWwcuduPehoscGcFDAo4_T7f_hhIxbrGEsKnlu4g")
    private String accessToken;

    @Schema(description = "Refresh token", example = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqb2huZG9lQGdtYWlsLmNvbSIsImlkIjoxLCJyb2xlcyI6WyJST0xFX0FETUlOIiwiUk9MRV9VU0VSIl0sImlhdCI6MTY4MjAxNjc1NywiZXhwIjoxNjgyMDE3MTE3fQ.fajfktDIgj4LOl1pk-HicUMcjQArq3kIsR2nx74jwk8VMujlWwcuduPehoscGcFDAo4_T7f_hhIxbrGEsKnlu4g")
    private String refreshToken;

}
