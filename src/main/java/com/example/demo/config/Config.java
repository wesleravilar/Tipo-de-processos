package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Config {
    @Configuration
    public class SpringConfig {

        @Bean
        public TransactionService transactionService() {
            return new TransactionServiceImpl();
        }

    }
}
