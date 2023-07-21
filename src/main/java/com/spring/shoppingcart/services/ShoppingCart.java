package com.spring.shoppingcart.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCart {
    private final List<Integer> items = new ArrayList<>();

    public void addItems(List<Integer> itemIds){
        items.addAll(itemIds);
    }

    public List<Integer> getItems() {
        return Collections.unmodifiableList(items);
    }
}
