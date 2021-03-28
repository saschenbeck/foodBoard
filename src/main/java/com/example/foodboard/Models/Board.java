package com.example.foodboard.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "boards")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 45)
    private String boardName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "board")
    private List<foodItem> foodItems;
}
