package com.tang.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 服务提供者：prodcut
 */
@RestController
public class ProductController {

    // 定义一个库存集合
    private static final Map<String, Integer> productMap = new HashMap<>();

    /***
     * 修改库存
     * @param productName 产品名
     * @param num 数量
     * @return 描述
     */
//    @GetMapping("/updateProduct/{productName}/{num}")
    @GetMapping("/updateProduct")
    public String updateProducter(String productName, Integer num) {
        if (productName != null && !productName.isEmpty()) {
            productMap.put(productName, (productMap.get(productName) == null ? 0 : productMap.get(productName)) - num);
            System.out.println("修改库存：productName-" + productName + ", num-" + num);
        }
        return "修改库存成功, " + productName + " 剩下 " + productMap.get(productName);
    }
}
