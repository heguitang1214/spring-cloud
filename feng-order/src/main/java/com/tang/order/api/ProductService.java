package com.tang.order.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Feign客户端  -- 指向哪个服务呢？
 * 需要指明服务，也可以配置fallback
 */
//@FeignClient(name = "provider-product")
public interface ProductService {

    @GetMapping("/updateProduct/{productName}/{num}")
    String updateProduct(@PathVariable("productName") String productName, @PathVariable("num") Integer num);
}
