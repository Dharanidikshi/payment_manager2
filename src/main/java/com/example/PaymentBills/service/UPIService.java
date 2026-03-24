package com.example.PaymentBills.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class UPIService implements PaymentService {

    @Override
    public String pay(double amount) {
        return amount + " UPI";
    }
}