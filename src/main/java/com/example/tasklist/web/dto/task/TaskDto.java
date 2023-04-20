package com.example.tasklist.web.dto.task;

import com.example.tasklist.domain.task.Status;
import com.example.tasklist.web.dto.validation.OnCreate;
import com.example.tasklist.web.dto.validation.OnUpdate;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@Schema(description = "Task DTO")
public class TaskDto {

    @Schema(name = "Task id", example = "1")
    @NotNull(message = "Id must be not null", groups = OnUpdate.class)
    private Long id;

    @Schema(name = "Title of the task", example = "Buy milk")
    @NotNull(message = "Title must be not null", groups = {OnUpdate.class, OnCreate.class})
    @Length(max = 255, message = "Title length must be smaller than 255 symbols", groups = {OnUpdate.class, OnCreate.class})
    private String title;

    @Schema(name = "Description of the task", example = "Buy low fat milk for brother")
    @Length(max = 255, message = "Description length must be smaller than 255 symbols", groups = {OnUpdate.class, OnCreate.class})
    private String description;

    @Schema(name = "Status of the task", example = "TODO")
    private Status status;

    @Schema(name = "Expiration date of the task", example = "2023-03-18 12:00:00")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime expirationDate;

}
