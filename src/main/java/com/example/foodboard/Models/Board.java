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

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="boards_categories",
            joinColumns={@JoinColumn(name="board_id")},
            inverseJoinColumns={@JoinColumn(name="foodItem_id")}
    )
    private List<foodItem> foodItems;

    public Board(){

    }
}
