package com.aag.mybook.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class UserDTO {

    @NotBlank(message = "error.name.not.null")
    private String name;
    @NotBlank(message = "error.email.not.null")
    private String email;
    @NotBlank(message = "error.phone.not.null")
    private String phone;

}
