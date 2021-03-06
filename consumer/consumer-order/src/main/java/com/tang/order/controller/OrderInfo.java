package com.tang.order.controller;

import java.io.Serializable;

/**
 * 订单实体
 *
 * @author : Tang
 * @since : 2019年04月24日 21:20
 */

public class OrderInfo implements Serializable {
    private String productName;
    private Integer num;

    public OrderInfo(String productName, Integer num) {
        this.productName = productName;
        this.num = num;
    }

    public OrderInfo() {

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "productName='" + productName + '\'' +
                ", num=" + num +
                '}';
    }
}
