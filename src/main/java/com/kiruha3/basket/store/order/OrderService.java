package com.kiruha3.basket.store.order;

import com.kiruha3.basket.store.Basket;
import com.kiruha3.basket.store.Item;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;


@Service
@SessionScope
public class OrderService implements OrderInterface {
    public List<Integer> listItems = new ArrayList<>();
//    private final Basket basket;

//    public OrderService(Basket basket) {
//        this.basket = basket;
//    }
    @PostConstruct
    public void setup(){
        System.out.println("setup");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }

    @Override
    public void add(List<Integer> itemsIds) {
        for (Integer itemsId : itemsIds) {
            if (!listItems.contains(itemsId)) {
                listItems.add(itemsId);
            }
        }
    }

    @Override
    public List<Integer> get() {
        return listItems;
    }
}
