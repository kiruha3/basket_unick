package com.kiruha3.basket.store;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
//@Component
//@Scope("session")
@Service

public class Basket {
    public List<Integer> listItems = new ArrayList<>();
}
