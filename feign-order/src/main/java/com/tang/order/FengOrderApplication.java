package com.tang.order;

import com.tang.order.api.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableFeignClients(clients = {ProductService.class})
@EnableFeignClients(basePackages = {"com.tang.order.api"})
public class FengOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(FengOrderApplication.class, args);
    }

//	@Bean
//	@LoadBalanced
//	public RestTemplate restTemplate(){
//		return new RestTemplate();
//	}
}
