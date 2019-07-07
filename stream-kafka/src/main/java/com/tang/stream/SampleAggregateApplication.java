//package com.tang.stream;
//
//import com.tang.stream.aggr.processor.ProcessorApplication;
//import com.tang.stream.aggr.sink.SinkApplication;
//import com.tang.stream.aggr.source.SourceApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.stream.aggregate.AggregateApplicationBuilder;
//
//@SpringBootApplication
//public class SampleAggregateApplication {
//
//    public static void main(String[] args) {
//        new AggregateApplicationBuilder()
//                .from(SourceApplication.class).namespace("source-1").args("--fixedDelay=5000")
//                .via(ProcessorApplication.class).namespace("processor-1")
//                .to(SinkApplication.class).namespace("sink-1").args("--debug=true")
//                .run(args);
//    }
//}
