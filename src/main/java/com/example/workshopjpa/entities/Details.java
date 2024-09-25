package com.example.workshopjpa.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString

@Entity
public class Details {

    @Id
    @Column
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Setter
    @Column(nullable = false , unique = true, length = 100)
    private String email;
    @Setter
    @Column(nullable = false, length = 100)
    private String name;
    @Column
    private LocalDate birthDate;


    public Details(String email, String name, LocalDate birthDate) {
        this.email = email;
        this.name = name;
        this.birthDate = birthDate;
    }
}
