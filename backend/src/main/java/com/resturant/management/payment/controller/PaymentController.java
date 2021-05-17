package com.resturant.management.payment.controller;

import com.resturant.management.payment.model.Payment;
import com.resturant.management.payment.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Payment savePayment(@RequestBody Payment payment){
      return  paymentService.savePayment(payment);
    }
}
