package com.tang.hystrix.casetest.isolation;

import com.netflix.hystrix.*;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * 信号量方式实现线程隔离
 * 任务执行线程都是main线程，所以实际只支持同步方式调用。
 *
 * @author : Tang
 * @since : 2019年04月13日 15:42
 */

public class HystrixCommand4Semaphore extends HystrixCommand<String> {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    private final String name;

    public HystrixCommand4Semaphore(String name) {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("SemaphoreGroup"))
                        .andCommandKey(HystrixCommandKey.Factory.asKey("SemaphoreKey"))
                        .andThreadPoolKey(HystrixThreadPoolKey.Factory.asKey("SemaphoreThreadPoolKey"))
                        .andCommandPropertiesDefaults(
                                // 信号量隔离
                                HystrixCommandProperties.Setter()
                                        // 设置为信号量隔离，默认是线程池的隔离
                                        .withExecutionIsolationStrategy(HystrixCommandProperties.ExecutionIsolationStrategy.SEMAPHORE)
                                        .withExecutionTimeoutInMilliseconds(3000)
                                        // 配置信号量大小
                                        .withExecutionIsolationSemaphoreMaxConcurrentRequests(3)
                                // 配置降级并发量：设置执行Fallback逻辑的线程
//                                        .withFallbackIsolationSemaphoreMaxConcurrentRequests(1)
                        )
        );
        this.name = name;
    }

    /**
     * 线程的运行
     *
     * @return 描述
     * @throws Exception 异常
     */
    @Override
    protected String run() throws Exception {
        System.out.println(sdf.format(new Date()) + "," + Thread.currentThread() + " This is 【run】 in HystrixCommand , name :" + this.name);
        return this.name;
    }

    /**
     * 降级逻辑
     *
     * @return 描述
     */
    @Override
    protected String getFallback() {
        // 测试运行降级逻辑的线程数
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(sdf.format(new Date()) + "," + Thread.currentThread() + "Hi This is 【Fallback】 for name:" + this.name);
        return this.name;
    }

    public static void main(String[] args) {
        testHystrixCommand4Semaphore();
    }

    //    public static class UnitTest {
//        @Test
    private static void testHystrixCommand4Semaphore() {
        for (int i = 0; i < 5; i++) {
            final int j = i;
            try {
//                Future<String> queue = new HystrixCommand4Semaphore("Thread " + i).queue();
//                System.out.println("终于得到结果了：" + queue.get(1, TimeUnit.SECONDS));
                // 创建多个线程是为了模拟并发
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        new HystrixCommand4Semaphore("Thread " + j).execute();
                    }
                }).start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
//    }
}
