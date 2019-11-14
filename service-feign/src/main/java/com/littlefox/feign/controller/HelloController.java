package com.littlefox.feign.controller;

import com.littlefox.feign.service.HelloService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/feign")
public class HelloController {
    @Resource
    HelloService helloService;

    @RequestMapping( value = "/hello", method = RequestMethod.GET )
    @ResponseBody
    public String sayHi(@RequestParam String name){
        return helloService.sayHiFromClientOne(name);
    }

}
