package com.resturant.management.oder.service.impl;

import com.resturant.management.oder.model.Orders;
import com.resturant.management.oder.repository.OrdersRepository;
import com.resturant.management.oder.service.OrdersService;
import com.resturant.management.payment.model.Payment;
import com.resturant.management.payment.repository.PaymentRepository;
import com.resturant.management.user.model.User;
import com.resturant.management.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrdersServiceImpl implements OrdersService {

    private final OrdersRepository ordersRepository;
    private final PaymentRepository paymentRepository;
    private final UserRepository userRepository;


    public OrdersServiceImpl(OrdersRepository ordersRepository, PaymentRepository paymentRepository, UserRepository userRepository) {
        this.ordersRepository = ordersRepository;
        this.paymentRepository = paymentRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Orders saveOrders(Orders orders) {
        User user=userRepository.findById(orders.getUser().getId()).orElseThrow(()->new IllegalStateException("User not found!"));
        List<Orders> ordersList=user.getOrdersList();
        Orders orders1=new Orders();
        Payment payment=new Payment();
        payment.setPaymentType(orders.getPayment().getPaymentType());
        paymentRepository.save(payment);
        orders1.setPayment(payment);
        orders1.setItemList(orders.getItemList());
        orders1.setUser(orders.getUser());
        ordersRepository.save(orders1);
        ordersList.add(orders1);
        user.setOrdersList(ordersList);
        userRepository.save(user);
        return orders1;
    }

    @Override
    public List<Orders> findAllOrders() {
        return ordersRepository.findAll();
    }

    @Override
    public List<Orders> findAllOrdersByUser(User id) {
        return ordersRepository.findOrdersByUserId(id);
    }

    @Override
    public double getTotalAmount(Long orderId) {
        return ordersRepository.totalAmount(orderId);
    }
}
