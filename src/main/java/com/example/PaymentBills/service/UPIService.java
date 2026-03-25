package com.example.PaymentBills.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class UPIService implements PaymentService {

    public UPIService() {
        System.out.println("UPI Constructor Called");
    }

    @PostConstruct
    public void init() {
        System.out.println("UPI Bean Initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("UPI Bean Destroyed");
    }

    @Override
    public String pay(double amount) {
        return amount + " UPI";
    }
}