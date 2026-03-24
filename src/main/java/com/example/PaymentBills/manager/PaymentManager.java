package com.example.PaymentBills.manager;

import com.example.PaymentBills.service.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentManager {

    private final PaymentService upiService;
    private final PaymentService netBankingService;
    private final PaymentService terminalService;

    public PaymentManager(
            PaymentService upiService, // @Primary
            @Qualifier("netBanking") PaymentService netBankingService,
            @Qualifier("terminal") PaymentService terminalService
    ) {
        this.upiService = upiService;
        this.netBankingService = netBankingService;
        this.terminalService = terminalService;
    }

    public String processPayment(String type, double amount) {

        switch (type.toLowerCase()) {
            case "upi":
                return upiService.pay(amount);
            case "netbanking":
                return netBankingService.pay(amount);
            case "terminal":
                return terminalService.pay(amount);
            default:
                return "Invalid payment type";
        }
    }
}