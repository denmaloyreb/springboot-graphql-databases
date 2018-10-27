package com.mycompany.authorapi.rest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class UpdateAuthorDto {

    @ApiModelProperty(example = "Steve")
    private String firstName;

    @ApiModelProperty(position = 2, example = "Jobs")
    private String lastName;

    @ApiModelProperty(position = 3, example = "2002-02-02")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date birthday;

}
