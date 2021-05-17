package com.resturant.management.item.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

/*
* {
        "id": "197e816b-7724-49c9-818b-059c0ee36be2",
        "name": "test",
        "price": 1,
        "description": "test",
    }
    * */
@Entity
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private double price;
    private String description;



}
