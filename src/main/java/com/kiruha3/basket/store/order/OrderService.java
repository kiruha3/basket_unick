package com.kiruha3.basket.store.order;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;


@Service
@SessionScope
public class OrderService implements OrderInterface {
    public List<Integer> bascketForItems = new ArrayList<>();

    @PostConstruct
    public void setup() {
        System.out.println("setup");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }

    @Override
    public void add(List<Integer> itemsIds) {
        for (Integer itemsId : itemsIds) {
            if (!bascketForItems.contains(itemsId)) {
                bascketForItems.add(itemsId);
            }
        }
    }

    @Override
    public List<Integer> get() {
        return bascketForItems;
    }
}
