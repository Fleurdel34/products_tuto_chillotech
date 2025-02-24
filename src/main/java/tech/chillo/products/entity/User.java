package tech.chillo.products.entity;

import jakarta.persistence.*;

@Entity
@Table(name="utilisateur")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


}
