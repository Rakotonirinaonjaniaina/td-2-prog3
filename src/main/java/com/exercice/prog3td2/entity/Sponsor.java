package com.exercice.prog3td2.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Sponsor")
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Sponsor(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
