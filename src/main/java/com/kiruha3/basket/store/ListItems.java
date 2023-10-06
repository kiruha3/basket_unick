package com.kiruha3.basket.store;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ListItems {
    public List<Item> listItems = Arrays.asList(
            new Item(0,"phone"),
            new Item(1,"phone1"),
            new Item(2,"phone2"),
            new Item(3,"phone3"),
            new Item(4,"phone4"),
            new Item(5,"phone5"),
            new Item(6,"phone6")
    );
    public void listItems(){
        listItems.add(new Item(0,"phone"));
    }

}
