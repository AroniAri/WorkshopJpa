package com.example.workshopjpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor


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
    //@JoinColumn(name = "app_user")
    private AppUser borrower;

    @ManyToOne
    //@JoinColumn(name = "book_id")
    private Book book;




}
