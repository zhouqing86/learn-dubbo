package com.alibaba.dubbo.demo.controller;

import com.alibaba.dubbo.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/hello")
    public String hello() {
        String hello = demoService.sayHello("world");
        return hello;
    }

}
