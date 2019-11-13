package com.littlefox.feign.controller;

import com.littlefox.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/s")
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    @ResponseBody
    public String sayHi(@RequestParam String name){
        return helloService.sayHiFromClientOne(name);
    }

}
