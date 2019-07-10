package com.tang.stream.aggregate.sink;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;

@SpringBootApplication
@EnableBinding(Sink.class)
public class SinkApplication {

    private static Logger logger = LoggerFactory.getLogger(SinkApplication.class);

    /**
     * 接受消息
     * ServiceActivator 不属于stream的，是spring.integration中轻量级的消息代理框架
     * 类似于StreamListener，只不过StreamListener可以转换消息，而ServiceActivator接收到是什么样子就是什么样子
     *
     * @param payload 消息
     */
    @ServiceActivator(inputChannel = Sink.INPUT)
    public void loggerSink(Object payload) {
        logger.info("Receive Message: " + payload);
    }
}
