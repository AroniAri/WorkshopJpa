package entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


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



    @Setter
    @OneToOne
    @JoinColumn(name = "details_id")
    private Details details;


    public AppUser(String username, String password, Details details) {
        this.username = username;
        this.password = password;
        this.details = details;
    }
}
