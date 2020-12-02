package com.spring.feign.controller;

import com.spring.feign.service.FeignRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: $
 * @return: $
 * @author: Andy
 * @time: $ $
 */
@RestController
public class FeignController {

    @Qualifier("hystrixFeignRemoteCallBack")
    @Autowired
    FeignRemoteService feignRemoteService;

    @GetMapping(value = "/getHello")
    public String getHello(@RequestParam String name) {
        return feignRemoteService.hello(name);
    }

    @GetMapping(value = "/testzuul")
    public String testzuul(@RequestParam String name) {
        return name +",这是springcloud-feign-client的服务接口";
    }

}
