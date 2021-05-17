package com.resturant.management.item.controller;

import com.resturant.management.item.model.Item;
import com.resturant.management.item.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Item saveItem(@RequestBody Item item){
        return itemService.saveItem(item);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Item> findAllItem(){
        return itemService.getAllFood();
    }
}
