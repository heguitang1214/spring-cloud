package com.tang.stream.shunt;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * 自定义的实现
 */
public interface OrderChannel {

    /**
     * 对应着配置文件
     */
    String ORDER_INPUT = "order_input";

    String ORDER_OUTPUT = "order_output";

    @Input(ORDER_INPUT)
    SubscribableChannel receiveMessage();

    @Output(ORDER_OUTPUT)
    MessageChannel sendMessage();
}
