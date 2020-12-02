package com.spring.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: $
 * @return: $
 * @author: Andy
 * @time: $ $
 */
@RestController
public class ClientController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/hello")
    public String clientTest(@RequestParam String name){
        return name +"----"+ port ;
    }
}
