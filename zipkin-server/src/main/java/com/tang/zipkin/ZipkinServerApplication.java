package com.tang.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
// 老版本 + 新版本的使用注解
//@EnableZipkinServer
// 老版本流的使用方式
@EnableZipkinStreamServer
public class ZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApplication.class, args);
    }

}
