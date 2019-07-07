package com.tang.stream.controller;

//import com.tang.stream.channel.OrderChannel;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.cloud.stream.annotation.StreamListener;
//import org.springframework.messaging.Message;
//import org.springframework.messaging.MessageChannel;
//import org.springframework.messaging.support.MessageBuilder;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class ProcessController {
//
//    @Autowired
//    @Qualifier(OrderChannel.ORDER_OUTPUT)
//    private MessageChannel sendMessageChannel;
//
//    /**
//     * 发送消息 + 接收消息
//     *
//     * @param content 消息
//     * @return 结果
//     */
//    @GetMapping("/processor/sendMessage")
//    public String processorSendShopMessage(String content) {
//        boolean success = sendMessageChannel.
//                send(MessageBuilder.withPayload(content).build());
//        return success ? "success" : "failed";
//    }
//
//
//    @StreamListener(OrderChannel.ORDER_INPUT)
//    public void receive(Message<String> message) {
//        System.out.println("======>" + message.getPayload());
//    }
//}
