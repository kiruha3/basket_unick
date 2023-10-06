package com.kiruha3.basket.store.order;

import com.kiruha3.basket.store.Basket;
import com.kiruha3.basket.store.Item;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderService implements OrderInterface {

    private final Basket basket;

    public OrderService(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void add(Integer itemsId) {
        basket.listItems.add(itemsId);
    }

    @Override
    public List<Integer> get() {
        return basket.listItems;
    }
}
