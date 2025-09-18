package cz.kolonicnystepan.parkhouse.entities;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(name= "email", unique = true, nullable = false)
private String email;
@Column(name = "password", nullable = false)
private String password;
@Column(name = "first_name", nullable = false)
private String firstName;
@Column(name = "last_name", nullable = false)
private String lastName;
@Column(name="address")
private String address;
@Column(name="company_name")
private String companyName;

}
