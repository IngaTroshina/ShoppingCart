package com.spring.shoppingcart.services;

import java.util.List;

public interface OrderService {
    void addItems (List<Integer> itemsIds);
    List<Integer>getItems();
}
