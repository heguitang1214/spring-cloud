package com.tang.config.clientdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取git中分布式配置的接口
 *
 */
@RestController
public class HelloController {

    @Autowired
    private Person person;

    @GetMapping("/getName")
    public String getName() {
        return person.getName();
    }
}
