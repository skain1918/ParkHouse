package cz.kolonicnystepan.parkhouse.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Place
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id",length = 20, nullable = false)
    private int id;
    @Column(name= "name", length = 20, nullable = false)
    private String name;
    @Column(name= "price", precision = 10, scale = 2, nullable = false)
    private BigDecimal price;
    @Column(name= "description")
    private String description;
}
