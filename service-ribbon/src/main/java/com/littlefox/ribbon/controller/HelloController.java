package com.littlefox.ribbon.controller;

import com.littlefox.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hello")
    public String hi(@RequestParam String name) {
        return helloService.helloService(name);
    }

}
