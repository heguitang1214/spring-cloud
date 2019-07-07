package com.tang.stream.source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

//@Component
//public class SendMessage1 {
//
//    /**
//     * rabbitmq  kafka  rocketMQ(binder) redis gemfire jms
//     */
//    @Autowired
//    private Source source;
//
//
//    public SendMessage1(Source source) {
//        this.source = source;
//    }
//
//    public void sayHello(String name) {
//        source.output().send(MessageBuilder.withPayload(name).build());
//    }
//}
