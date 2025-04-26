package com.pm.billingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//TODO: Solve the problem when starting the app without being connected to the Docker Container...
//TODO: enhance to connection to be held by aws/azure instead of local machine
//TODO: ? can add support for both angular and native methods?

@SpringBootApplication
public class BillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }

}
