package com.spring.shoppingcart.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class ShoppingCart {
    private final List<Integer> items = new ArrayList<>();

    public void addItems(List<Integer> itemIds){
        items.addAll(itemIds);
    }

    public List<Integer> getItems() {
        return Collections.unmodifiableList(items);
    }
}
