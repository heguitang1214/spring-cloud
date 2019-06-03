package com.tang.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//可以使用@EnableEurekaClient代替@EnableDiscoveryClient，
// 但是@EnableEurekaClient只能使用Eureka的实现
// 而@EnableDiscoveryClient还支持consual
public class ProductDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductDemoApplication.class, args);
	}

}
