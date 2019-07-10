package com.tang.stream.customize;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 发送消息 + 接收消息
 */
@RestController
public class CustomizeController {

    @Autowired
    @Qualifier(OrderChannel.ORDER_OUTPUT)
    private MessageChannel sendMessageChannel;

    /**
     * 发送消息
     *
     * @param content 消息
     * @return 结果
     */
    @GetMapping("/processor/sendMessage")
    public String processorSendShopMessage(String content) {
        boolean success = sendMessageChannel.
                send(MessageBuilder.withPayload(content).build());
        return success ? "success" : "failed";
    }

    /**
     * 接收消息
     * StreamListener为流的监听器
     *
     * @param message 消息
     */
    @StreamListener(OrderChannel.ORDER_INPUT)
    public void receive(Message<String> message) {
        System.out.println("======>" + message.getPayload());
    }
}
