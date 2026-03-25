package com.example.PaymentBills.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service("netBanking")
@Lazy
public class NetBankingService implements PaymentService {

    public NetBankingService() {
        System.out.println("NetBanking Bean Created");
    }

    @Override
    public String pay(double amount) {
        return amount + " NetBanking";
    }
}