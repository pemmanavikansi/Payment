package com.example.payment.controller;

import com.example.payment.bo.Payment;
import com.example.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome to payment-service";
    }

    @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment){
        return paymentService.savePayment(payment);
    }

    @GetMapping("/getAll")
    public List<Payment> getPayments(){
        return paymentService.getPayments();
    }
}
