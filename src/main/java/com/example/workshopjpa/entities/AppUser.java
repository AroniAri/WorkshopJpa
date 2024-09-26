package com.example.workshopjpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString(exclude = "regDate")
@Getter
@Setter


@Entity
public class AppUser {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    @Setter
    private String username;

    @Column(nullable = false)
    @Setter
    private String password;

    private LocalDate regDate;


    @Setter
    @OneToOne
    @JoinColumn(name = "user_details_id")
    private Details userDetails;

    @OneToMany(mappedBy = "borrower", cascade = CascadeType.ALL)
    private List<BookLoan> bookLoans = new ArrayList<>();

    public AppUser(String username, String password, LocalDate regDate, Details userDetails) {
        this.username = username;
        this.password = password;
        this.regDate = regDate;
        this.userDetails = userDetails;

    }

    public void addBookLoan(BookLoan loan) {
        this.bookLoans.add(loan);
        loan.setBorrower(this);


    }


}






