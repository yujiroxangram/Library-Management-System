package com.example.library.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id", columnDefinition = "BINARY(16)", updatable = false, nullable = false)
    private UUID id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String role; // "ADMIN", "LIBRARIAN", "STUDENT"

    private String password; // Hashed password
}
