package com.resturant.management.item.service.impl;

import com.resturant.management.item.model.Item;
import com.resturant.management.item.repository.ItemRepository;
import com.resturant.management.item.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }


    @Override
    public List<Item> getAllFood() {
        return (List<Item>) itemRepository.findAll();
    }
}
