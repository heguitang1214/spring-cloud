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
    
    > user: 8930
* 服务的提供者provider：
    > product: 8900
    > http://localhost:8900/updateProduct/abc/100
    > http://localhost:8900/updateProduct?productName=abc&num=100
    
    >user: 8920
    
* 熔断器Hystrix：9900
    > 

* 网关zuul：9999
    > 1.不使用注册中心，直接配置网关的代理的地址，分别直接访问服务和使用网关访问服务，使用网关访问服务示例：http://localhost:9999/provider-user/provider/1
    > 2.




