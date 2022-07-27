package com.ivanfranchin.authorbookapi.restapi.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CreateAuthorRequest {

    @Schema(example = "Craig Walls")
    @NotBlank
    private String name;
}
