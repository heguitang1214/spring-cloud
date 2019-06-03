package com.tang.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务消费者：order
 *
 * @author Tang
 */
@RestController
public class OrderController {

    private static final List<OrderInfo> list = new ArrayList<>();

    @Autowired
    private RestTemplate restTemplate;

    /***
     * 下单接口 --  调用服务提供者provider /updateProduct 接口
     * @param productName productName
     * @param num 数量
     * @return 描述
     */
    @GetMapping("/order")
    public String order(String productName, Integer num) {

        if (productName != null && !productName.isEmpty()) {
            list.add(new OrderInfo(productName, num));
            // 调用服务提供者
//            String result = restTemplate.getForObject("http://provider-product/updateProduct/" + productName + "/" + num, String.class);
            String result = restTemplate.getForObject("http://provider-product/updateProduct?productName=" + productName + "&num=" + num, String.class);
//            String result = restTemplate.getForObject("http://127.0.0.1:8900/updateProduct?productName=" + productName + "&num=" + num, String.class);
            System.out.println("调用product服务提供者，返回：" + result);
            System.out.println(list);
            return result;
        }
        return null;
    }
}
