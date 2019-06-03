package com.tang.config.clientdemo;

import com.tang.config.clientdemo.controller.MyHealthIndicator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConfigClientDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientDemoApplication.class, args);
    }

    @Bean
    public HealthIndicator healthIndicator() {
        return new MyHealthIndicator();
    }

}
