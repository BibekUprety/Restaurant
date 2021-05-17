package com.resturant.management.oder.controller;

import com.resturant.management.oder.model.Orders;
import com.resturant.management.oder.service.OrdersService;
import com.resturant.management.user.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/orders")
public class OrdersController {
    private OrdersService ordersService;

    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Orders saveOrders(@RequestBody Orders orders){
        return ordersService.saveOrders(orders);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Orders> findAll(){
        return ordersService.findAllOrders();
    }

    @GetMapping("users/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Orders> getAllOrdersByUser(@PathVariable User id){
        return ordersService.findAllOrdersByUser(id);
    }

    @GetMapping("/totalAmount/{id}")
    @ResponseStatus(HttpStatus.OK)
    public double getTotalAmount(@PathVariable("id") Long orderId){
        return ordersService.getTotalAmount(orderId);
    }
}
