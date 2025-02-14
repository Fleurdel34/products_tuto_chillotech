package tech.chillo.products.entity;

import jakarta.persistence.*;
import lombok.*;


@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private int price;

}
