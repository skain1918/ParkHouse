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
public class Place
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id", nullable = false)
    private int id;
    @Column(name= "name", nullable = false)
    private String name;
    @Column(name= "price", nullable = false)
    private double price;
    @Column(name= "description")
    private String description;
}
