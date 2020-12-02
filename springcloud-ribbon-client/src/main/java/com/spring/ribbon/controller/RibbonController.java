package com.spring.ribbon.controller;

import com.spring.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class RibbonController {
    @Autowired
    RibbonService ribbonService;

    @GetMapping(value = "/getHello")
    public String getHello(@RequestParam  String name) {
        return ribbonService.getHello(name);
    }

    @GetMapping(value = "testzuul")
    public String testzuul(@RequestParam String name) {
         return name +",这是springCloud-ribbon-clientd的服务接口";
    }
}
