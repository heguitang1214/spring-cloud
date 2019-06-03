package com.tang.config.clientdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * 配置Bean
 *
 */
@Component
@RefreshScope
public class Person {

    @Value("${name}")
    private String name;

    public String getName() {
        return name;
    }

}
