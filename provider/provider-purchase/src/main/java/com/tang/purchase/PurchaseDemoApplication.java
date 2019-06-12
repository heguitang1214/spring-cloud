package com.tang.purchase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PurchaseDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PurchaseDemoApplication.class, args);
    }

}


