package com.example.library.model;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String isbn;

    private int quantity;

    private boolean isAvailable;

    // Many Books to One Author (via Author entity)
    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;
}
