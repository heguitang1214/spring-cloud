package com.tang.hystrix.casetest.isolation;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * 自定义hystrix
 */
public class FutureDemo {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(1);
        Random random = new Random();
        Future<?> future = service.submit(new Runnable() {
            @Override
            public void run() {
                int val = random.nextInt(1000);
                try {
                    TimeUnit.MILLISECONDS.sleep(val);

                    System.out.println("random value is " + val);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        try {
            future.get(500, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            System.out.println("超时了!!!!!!");
            String fallback = FutureDemo.fallback();
            System.out.println("执行降级逻辑，得到" + fallback);
            e.printStackTrace();
        }
        service.shutdown();
    }

    private static String fallback() {
        return "fallback";
    }
}
