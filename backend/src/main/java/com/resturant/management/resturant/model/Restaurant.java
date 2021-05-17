package com.resturant.management.resturant.model;

import com.resturant.management.item.model.Item;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;

    @OneToMany
    List<Item> itemList;


}
