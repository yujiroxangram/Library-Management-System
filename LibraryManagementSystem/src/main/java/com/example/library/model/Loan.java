package com.example.library.model;

import lombok.*;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Who borrowed the book
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Which book was borrowed
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    // Dates
    @Column(nullable = false)
    private LocalDate loanDate;

    @Column(nullable = false)
    private LocalDate dueDate;

    private LocalDate returnDate; // null if not returned yet

    // Optional: status field for easier querying
    @Enumerated(EnumType.STRING)
    private LoanStatus status;  // e.g., BORROWED, RETURNED, OVERDUE
}

// Enum for status
enum LoanStatus {
    BORROWED,
    RETURNED,
    OVERDUE
}
