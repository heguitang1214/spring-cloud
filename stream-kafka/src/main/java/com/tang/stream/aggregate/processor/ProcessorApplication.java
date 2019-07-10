package com.tang.stream.aggregate.processor;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.Transformer;

@SpringBootApplication
@EnableBinding(Processor.class)
public class ProcessorApplication {

    /**
     * 消息的转换 接受消息，然后转换消息
     * 过滤器的作用
     *
     * @param payload 请求消息
     * @return 转换后的消息
     */
    @Transformer(inputChannel = Sink.INPUT, outputChannel = Source.OUTPUT)
    public String loggerSink(String payload) {
        return payload.toUpperCase() + " +Test....";
    }
}