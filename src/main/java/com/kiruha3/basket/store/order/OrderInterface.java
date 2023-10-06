package com.kiruha3.basket.store.order;

import com.kiruha3.basket.store.Basket;
import com.kiruha3.basket.store.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderInterface {
    void add (Integer itemsIds);
    List<Integer> get();
}
