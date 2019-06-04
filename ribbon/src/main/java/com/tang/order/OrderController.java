package com.tang.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO..
 *
 * @author : Five-云析学院
 * @since : 2019年04月24日 21:18
 */

@RestController
public class OrderController {

    private static final List<OrderInfo> list = new ArrayList<>();

    @Autowired
    private RestTemplate restTemplate;

    /***
     * 下单接口 --  调用服务提供者provider /updateProduct 接口
     * @param productName 产品名称
     * @param num 数量
     * @return 描述
     */
    @GetMapping("/order/{productName}/{num}")
    public String order(@PathVariable("productName") String productName, @PathVariable("num") Integer num) {
        if (productName != null && !productName.isEmpty()) {
            list.add(new OrderInfo(productName, num));
            // 调用服务提供者
            String result = restTemplate.getForObject("http://provider-product/updateProduct/" + productName + "/" + num, String.class);
            System.out.println("调用消费者product，返回结果为：" + result);
            return result;
        }
//        String result = restTemplate.getForObject("http://log-provider/logs", String.class);
        return null;
    }
}
