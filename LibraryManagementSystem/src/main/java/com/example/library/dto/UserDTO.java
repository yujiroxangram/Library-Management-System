package com.example.library.dto;

import java.util.UUID;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDTO {

    private UUID id;
    private String name;
    private String email;
    private String role;
}