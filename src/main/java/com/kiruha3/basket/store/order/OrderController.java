package com.kiruha3.basket.store.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/store/order")
@RestController
public class OrderController {
    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping()
    public String logInPage() {
        return "Приветствую вас на стартовой странице";
    }

    @GetMapping(path = "/add")
    public void addItemInBasket(@RequestParam(value = "items", required = false) List<Integer> itemIds) {
        orderService.add(itemIds);
    }
    @GetMapping(path = "/get")
    public List<Integer> addItemInBasket() {
        return orderService.get();
    }

}
