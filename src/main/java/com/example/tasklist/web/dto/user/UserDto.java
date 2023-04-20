package com.example.tasklist.web.dto.user;

import com.example.tasklist.web.dto.validation.OnCreate;
import com.example.tasklist.web.dto.validation.OnUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
@Schema(description = "User DTO")
public class UserDto {

    @Schema(name = "User id", example = "1")
    @NotNull(message = "Id must be not null", groups = OnUpdate.class)
    private Long id;

    @Schema(name = "User's name", example = "Carl")
    @NotNull(message = "Name must be not null", groups = { OnUpdate.class, OnCreate.class })
    @Length(max = 255, message = "Name length must smaller than 255 symbols", groups = {OnUpdate.class, OnCreate.class})
    private String name;

    @Schema(name = "User's username", example = "carl123")
    @NotNull(message = "Username must be not null", groups = { OnUpdate.class, OnCreate.class })
    @Length(max = 255, message = "Username length must smaller than 255 symbols", groups = {OnUpdate.class, OnCreate.class})
    private String username;

    @Schema(name = "Password", example = "pass123")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Password must be not null", groups = { OnUpdate.class, OnCreate.class })
    private String password;

    @Schema(name = "Password confirmation", example = "pass123")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Password confirmation must be not null", groups = { OnCreate.class })
    private String passwordConfirmation;

}
