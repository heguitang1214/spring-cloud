package com.tang.stream.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//@SpringBootApplication
//@EnableBinding(Source.class)
//public class SourceApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(SourceApplication.class, args);
//    }
//
//
//    @InboundChannelAdapter(value = Source.OUTPUT)
//    public String timerMessageSource() {
//        return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
//    }
//}
