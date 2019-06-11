package com.tang.order.api;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * feng接口的继承
 */
@FeignClient(name="provider-product")
public interface ProudctUpdateService extends ProductService {

}
