package com.example.workshopjpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Setter


@Entity
public class Book {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id;


    private String title;

    private String isbn;

    @Column(nullable = false)
    @Setter
    private int maxLoanDays;
    private boolean available = true;


    @OneToMany(mappedBy = "book")
    @Setter
    private Set<BookLoan> bookLoans = new HashSet<>();


    public void setAvilable(boolean b) {
    }
}
