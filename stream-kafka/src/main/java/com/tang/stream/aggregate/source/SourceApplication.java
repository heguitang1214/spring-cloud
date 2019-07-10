package com.tang.stream.aggregate.source;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@EnableBinding(Source.class)
public class SourceApplication {

    /**
     * 消息的发送者，发送时间
     * @return 时间
     */
    @InboundChannelAdapter(value = Source.OUTPUT)
    public String timerMessageSource() {
        return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }
}
