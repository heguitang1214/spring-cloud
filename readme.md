# Spring Cloud Demo
* 搭建SpringCloud各组件使用的demo，学习使用SpringCloud微服务

## 端口设置
* 配置中心config server：9090
    > 服务端的访问：http://localhost:9090/yunxi-dev.properties
    > 客户端的测试访问：http://localhost:8080//getName
* 注册中心eureka：8761
    > [http://localhost:8761/](http://localhost:8761/)
* 服务的消费者consumer：
    > order: 8910
    > http://localhost:8910/order/abc/100
    > http://localhost:8910/order?productName=abc&num=100
    
    > user: 8930
    http://localhost:8930/consumer/100
    
    > feng-order: 8950
    
    > user-bus：8960
    
* 服务的提供者provider：
    > product: 8900
    > http://localhost:8900/updateProduct/abc/100
    > http://localhost:8900/updateProduct?productName=abc&num=100
    
    > user: 8920
    > http://localhost:8920/provider/100
    
* 熔断器Hystrix：9900
    > 

* 网关zuul：9999
    > 只需要在网关指定【需要网关代理的服务】，通过注册中心来进行调度
    > 1.不使用注册中心，直接配置网关的代理的地址，分别直接访问服务和使用网关访问服务，使用网关访问服务示例：http://localhost:9999/provider-user/provider/1
    > 2.使用注册中心
    > 3.使用注册中心 + 配置中心

* Feng
    > 需要修改服务的消费者，消费者调用对应的接口即可
    示例：http://localhost:8950/fengOrder/abc/100

* 消息总线bus
    > user-bus：8960 自动创建topic
    示例：http://localhost:8960/consumer/user/bus/hello
    bus消息通知刷新配置(通过消息通道，重新获取配置)：Linux服务器上执行
    curl -X POST 192.168.0.104:8960/bus/refresh 或者 curl -X POST 192.168.56.1:8960/bus/refresh
    
    > 刷新配置中心
        curl -X POST 192.168.0.104:9090/bus/refresh

* stream：9900
    > source：http://localhost:9900/source/sendMessage
    > channel：http://localhost:9900/channel/sendMessage
    > 自定义的发送接收：http://localhost:9900/processor/sendMessage?content=ok
    > 消息分流：http://localhost:9900/shunt/sendMessage?content=bar
    > 消息分流：http://localhost:9900/shunt/sendMessage?content=foo

* zipkin：9400
    > 页面监控：http://localhost:9400/zipkin/
    