package com.example.workshopjpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor


@Entity
public class BookLoan {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private LocalDate loanDate;

    @Column
    private LocalDate dueDate;

    @Column
    private boolean returned;



    @ManyToOne
    @JoinColumn(name = "borrower_id")
    private AppUser borrower;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    public BookLoan(LocalDate loanDate, LocalDate dueDate, AppUser borrower, boolean returned, Book book) {
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.borrower = borrower;
        this.returned = returned;
        this.book = book;
    }
}
