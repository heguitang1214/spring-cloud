package com.tang.order.order;

import com.tang.order.api.ProudctUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.tang.order.api.ProductService;

import java.util.ArrayList;
import java.util.List;

/**
 * Feng的使用
 *
 * @author : Tang
 * @since : 2019年04月24日 21:18
 */
@RestController
public class OrderController {

    private static final List<OrderInfo> list = new ArrayList<>();

    @Autowired
//    private ProductService productService;
    private ProudctUpdateService proudctUpdateService;


    /***
     * 下单接口 --  调用服务提供者provider /updateProduct 接口
     * @param productName 产品名称
     * @param num 数量
     * @return 返回描述
     */
    @GetMapping("/fengOrder/{productName}/{num}")
    public String order(@PathVariable("productName") String productName, @PathVariable("num") Integer num) {

        if (productName != null && !productName.isEmpty()) {
            list.add(new OrderInfo(productName, num));
            // 调用服务提供者
//            String result = restTemplate.getForObject("http://provider-product/updateProduct/" + productName + "/" + num, String.class);

            // 使用Feign调用客户端API
//            String result = productService.updateProduct(productName, num);
            String result = proudctUpdateService.updateProduct(productName, num);
            System.out.println("使用Feign调用客户端API，返回结果为:" + result);
            return result;
        }
        return null;
    }
}
