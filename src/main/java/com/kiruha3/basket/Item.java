package com.kiruha3.basket;

public class Item {
    private  Integer id;
    private String name;

    public Item(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
