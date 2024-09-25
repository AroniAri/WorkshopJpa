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
@ToString ()
public class AppUser {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column (nullable = false, unique = true)
    @Setter
    private String username;

    @Column(nullable = false, length = 100)
    @Setter
    private String password;

    @Column
    private LocalDate registrationDate;

    @Setter
    @OneToOne
    private Details details;

    public AppUser(String username, String password, Details details) {
        this.username = username;
        this.password = password;
        this.details = details;
    }




}
