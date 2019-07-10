package com.tang.stream.processor;

//import com.tang.stream.customize.OrderChannel;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.stream.annotation.EnableBinding;
//import org.springframework.cloud.stream.messaging.Processor;
//import org.springframework.cloud.stream.messaging.Sink;
//import org.springframework.cloud.stream.messaging.Source;
//import org.springframework.integration.annotation.Transformer;
//
//@SpringBootApplication
//@EnableBinding(Processor.class)
//public class ProcessorApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(ProcessorApplication.class, args);
//    }
//
//    /**
//     * 过滤器的作用
//     */
////    @Transformer(inputChannel = Sink.INPUT, outputChannel = Source.OUTPUT)
////    public String loggerSink(String payload) {
////        return payload.toUpperCase() + " +Test....";
////    }
//}