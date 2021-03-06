package com.tang.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @since 2019年5月6日 下午9:53:39
 */
@Component
public class HystrixCacheService {

    @CacheResult(cacheKeyMethod = "getCacheKey")
    @HystrixCommand(
            groupKey = "CacheGroupKey",
            commandKey = "CacheCommandKey",
            threadPoolKey = "CacheThreadPoolKey")
    public String randomMethod(int max) {
        Random random = new Random();
        int nextInt = random.nextInt(max);
        System.out.println("nextInt:" + nextInt);
        return nextInt + "";
    }

    public String getCacheKey(int max) {
        return "cache-" + max;
    }
}
