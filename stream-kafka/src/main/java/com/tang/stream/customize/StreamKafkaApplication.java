package com.tang.stream.customize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * 自定义的启动类
 * 自定义的消息发送 + 消息接收
 */
@SpringBootApplication
@EnableBinding({OrderChannel.class})
public class StreamKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamKafkaApplication.class, args);
    }
}
