package com.resturant.management.payment.service;

import com.resturant.management.payment.model.Payment;
import org.springframework.stereotype.Service;


public interface PaymentService {

    Payment savePayment(Payment payment);

}
