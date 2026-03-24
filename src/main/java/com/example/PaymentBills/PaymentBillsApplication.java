package com.example.PaymentBills;

import com.example.PaymentBills.manager.PaymentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentBillsApplication implements CommandLineRunner {

    @Autowired
    private PaymentManager paymentManager;

    public static void main(String[] args) {
        SpringApplication.run(PaymentBillsApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println(paymentManager.processPayment("upi", 200));
        System.out.println(paymentManager.processPayment("netbanking", 500));
        System.out.println(paymentManager.processPayment("terminal", 300));
    }
}