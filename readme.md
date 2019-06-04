# Spring Cloud Demo
* 搭建SpringCloud各组件使用的demo

## 端口设置
* 配置中心config server：11000
    > 服务端的访问：http://localhost:9090/yunxi-dev.properties
    > 客户端的测试访问：http://localhost:8080//getName
* 注册中心eureka：8761
    > [http://localhost:8761/](http://localhost:8761/)
* 服务的消费者consumer：
    > order: 8910
    > http://localhost:8910/order/abc/100
    > http://localhost:8910/order?productName=abc&num=100
* 服务的提供者provider：
    > product: 8900
    > http://localhost:8900/updateProduct/abc/100
    > http://localhost:8900/updateProduct?productName=abc&num=100
* 熔断器Hystrix：9900
    > 

* 网关zuul：9999

