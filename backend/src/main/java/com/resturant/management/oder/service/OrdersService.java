package com.resturant.management.oder.service;

import com.resturant.management.oder.model.Orders;
import com.resturant.management.user.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OrdersService {

    Orders saveOrders(Orders orders);

    List<Orders> findAllOrders();

    List<Orders> findAllOrdersByUser(User id);

    double getTotalAmount(Long orderId);
}
