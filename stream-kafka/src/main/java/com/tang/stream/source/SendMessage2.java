package com.tang.stream.source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * 测试直接使用MessageChannel发送消息
 */
@Component
public class SendMessage2 {
    private MessageChannel output;

    @Autowired
    public SendMessage2(MessageChannel output) {
        this.output = output;
    }

    public void sayHello(String name) {
        output.send(MessageBuilder.withPayload(name).build());
    }
}
