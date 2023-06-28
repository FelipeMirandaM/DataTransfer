package com.eve.project.datatransfer.controllers;

import com.eve.project.datatransfer.models.Item;
import com.eve.project.datatransfer.services.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class ItemController {

    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/bluePrint")
    public List<Item> getBluePrintData(){

        return itemService.getAll();

    }

    @GetMapping("/bluePrint/{id}")
    public Item getBluePrintData(@PathVariable int id){

        return itemService.findOne(id);

    }

}
