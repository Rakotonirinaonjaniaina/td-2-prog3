package com.exercice.prog3td2.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "player")
public class player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int number;

    public player(Long id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number= number;
    }
}

