package com.example.workshopjpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

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

    @Column
    private String title;
    @Column
    private String isbn;
    @Column
    private String maxLoanDays;

    public Book(String title, String isbn, String maxLoanDays) {
        this.title = title;
        this.isbn = isbn;
        this.maxLoanDays = maxLoanDays;
    }



}
