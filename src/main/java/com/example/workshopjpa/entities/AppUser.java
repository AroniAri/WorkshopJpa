package com.example.workshopjpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


@Getter
@Entity


@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class AppUser {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column (unique = true, nullable = false)
    @Setter
    private String username;

    @Column(nullable = false)
    @Setter
    private String password;

    @Column
    private LocalDate regDate;

    @Setter
    @OneToOne
    @JoinColumn(name = "user_details_id")
    private Details userDetails;

    @OneToMany(mappedBy = "borrower")
    private Set<Book> borrowedBooks = new HashSet<>();

    public AppUser(String username, String password, Details details) {
        this.username = username;
        this.password = password;
        this.userDetails = details;
    }




}
