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

    public Board(String boardName, List<foodItem> foodItems){
        this.boardName = boardName;
        this.foodItems = foodItems;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public List<foodItem> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(List<foodItem> foodItems) {
        this.foodItems = foodItems;
    }
}
