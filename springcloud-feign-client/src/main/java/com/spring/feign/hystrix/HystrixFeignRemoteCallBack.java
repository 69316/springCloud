package com.spring.feign.hystrix;

import com.spring.feign.service.FeignRemoteService;
import org.springframework.stereotype.Component;

/**
 * @description: $
 * @return: $
 * @author: Andy
 * @time: $ $
 */
@Component
public class HystrixFeignRemoteCallBack implements FeignRemoteService {
    @Override
    public String hello(String name) {
        return name+",Due error ,enter Hystrix";
    }
}
