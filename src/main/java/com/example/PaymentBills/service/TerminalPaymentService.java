package com.example.PaymentBills.service;

import org.springframework.stereotype.Service;

@Service("terminal")
public class TerminalPaymentService implements PaymentService {

    @Override
    public String pay(double amount) {
        return amount + " Terminal";
    }
}