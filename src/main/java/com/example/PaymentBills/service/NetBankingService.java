package com.example.PaymentBills.service;

import org.springframework.stereotype.Service;

@Service("netBanking")
public class NetBankingService implements PaymentService {

    @Override
    public String pay(double amount) {
        return amount + " NetBanking";
    }
}