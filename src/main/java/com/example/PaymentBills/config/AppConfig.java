package com.example.PaymentBills.config;

import com.example.PaymentBills.service.TerminalPaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public TerminalPaymentService terminalBean() {
        System.out.println("Bean Created: TerminalPaymentService");
        return new TerminalPaymentService();
    }
}