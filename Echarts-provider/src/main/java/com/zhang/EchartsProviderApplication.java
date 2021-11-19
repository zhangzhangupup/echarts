package com.zhang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class EchartsProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(EchartsProviderApplication.class,args);
    }
}
