package com.example.library.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BookDTO {
    
    private Long id;
    private String title;
    private String authorName;
    private String isbn;
    private int quantity;
    private boolean isAvailable;
}
