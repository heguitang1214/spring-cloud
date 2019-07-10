package com.tang.stream.aggregate;

import com.tang.stream.aggregate.processor.ProcessorApplication;
import com.tang.stream.aggregate.sink.SinkApplication;
import com.tang.stream.aggregate.source.SourceApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.aggregate.AggregateApplicationBuilder;

/**
 * 消息聚合
 * 把所有的消息连接起来
 */
@SpringBootApplication
public class SampleAggregateApplication {

    /**
     * namespace 命名空间
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        new AggregateApplicationBuilder()
                .from(SourceApplication.class).namespace("source-1").args("--fixedDelay=5000")
                .via(ProcessorApplication.class).namespace("processor-1")
                .to(SinkApplication.class).namespace("sink-1").args("--debug=true")
                .run(args);
    }
}
