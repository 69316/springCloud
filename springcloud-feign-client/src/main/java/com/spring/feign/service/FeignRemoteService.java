package com.spring.feign.service;

import com.spring.feign.hystrix.HystrixFeignRemoteCallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value ="springcloud-eureka-client",fallback = HystrixFeignRemoteCallBack.class)
public interface FeignRemoteService {

    @GetMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
