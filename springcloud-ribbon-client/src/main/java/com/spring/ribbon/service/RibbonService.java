package com.spring.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description: $
 * @return: $
 * @author: Andy
 * @time: $ $
 */
@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    public String getHello(String name) {
        return restTemplate.getForObject("http://springcloud-eureka-client/hello?name="+name,String.class);
    }
}
