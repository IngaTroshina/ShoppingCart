package com.spring.shoppingcart.controllers;

import com.spring.shoppingcart.services.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ItemController {
    private final OrderService orderService;

    public ItemController(OrderService orderService) {
        this.orderService = orderService;
    }
    public void addItems(@RequestParam List<Integer> itemIds) {
        orderService.addItems(itemIds);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return orderService.getItems();
    }
}
