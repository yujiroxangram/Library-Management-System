package com.example.library.dto;

import java.time.LocalDate;
import java.util.UUID;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LoanDTO {
    private Long id;
    private Long bookId;
    private String bookTitle;
    private UUID userId;
    private String userName;
    private LocalDate issueDate;
    private LocalDate returnDate;
}
