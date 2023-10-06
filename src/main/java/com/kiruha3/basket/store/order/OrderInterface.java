package com.kiruha3.basket.store.order;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderInterface {
    void add(List<Integer> itemsIds);

    List<Integer> get();
}
