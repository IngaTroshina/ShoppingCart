package com.spring.shoppingcart.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService{
    private final ShoppingCart shoppingCart;

    public OrderServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void addItems(List<Integer> itemsIds) {
        shoppingCart.addItems(itemsIds);
    }

    @Override
    public List<Integer> getItems() {
        return shoppingCart.getItems();
    }
}
