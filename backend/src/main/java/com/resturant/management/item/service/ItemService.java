package com.resturant.management.item.service;

import com.resturant.management.item.model.Item;


import java.util.List;

public interface ItemService {

    Item saveItem(Item item);

    List<Item> getAllFood();
}
