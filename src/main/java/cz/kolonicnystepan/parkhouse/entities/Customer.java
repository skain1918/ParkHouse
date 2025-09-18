package cz.kolonicnystepan.parkhouse.entities;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "email", unique = true, length = 30, nullable = false)
    private String email;
    @Column(name = "password", length = 30, nullable = false)
    private String password;
    @Column(name = "first_name", length = 30, nullable = false)
    private String firstName;
    @Column(name = "last_name", length = 30, nullable = false)
    private String lastName;
    @Column(name = "address", length = 40)
    private String address;
    @Column(name = "company_name")
    private String companyName;

}
