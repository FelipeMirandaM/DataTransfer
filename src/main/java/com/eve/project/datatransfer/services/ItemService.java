package com.eve.project.datatransfer.services;

import com.eve.project.datatransfer.models.Item;
import com.eve.project.datatransfer.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private ItemRepository itemRepository;

    public ItemService(ItemRepository bluePrintRepository) {
        this.itemRepository = bluePrintRepository;
    }

    public List<Item> getAll() {

        return itemRepository.findAll();

    }

    public Item findOne(int id){

        return itemRepository.findById(id).get();

    }
}
