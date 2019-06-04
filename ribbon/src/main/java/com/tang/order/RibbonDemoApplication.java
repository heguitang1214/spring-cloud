package com.tang.order;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import okhttp3.OkHttpClient;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class RibbonDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonDemoApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


//    /**
//     * 修改restTempl的实现方式
//     *
//     * @return RestTemplate
//     */
//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate() {
//        return new RestTemplate(new OkHttp3ClientHttpRequestFactory(okHttpClient()));
//    }

//    /**
//     * http client
//     *
//     * @return okHttp
//     */
//    @Bean
//    public OkHttpClient okHttpClient() {
//        OkHttpClient.Builder builder = new OkHttpClient.Builder();
//        builder.connectTimeout(30, TimeUnit.SECONDS)
//                .readTimeout(10, TimeUnit.SECONDS)
//                .writeTimeout(10, TimeUnit.SECONDS)
//                .retryOnConnectionFailure(true);
//        return builder.build();
//    }


    /**
     * 修改负载均衡算法
     *
     * @return IRule
     */
    @Bean
    public IRule rule() {
        // 随机规则
        return new RandomRule();
    }


}
