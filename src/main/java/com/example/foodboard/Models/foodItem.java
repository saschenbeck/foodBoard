package com.example.foodboard.Models;

import javax.persistence.*;

@Entity
@Table(name = "foodItems")
public class foodItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    String name;
}
