package com.tang.stream.shunt;

import com.tang.stream.customize.OrderChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * 消息分流
 *
 * @author Tang
 */
@SpringBootApplication
@EnableBinding({OrderChannel.class})
public class ShuntKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShuntKafkaApplication.class, args);
    }
}
