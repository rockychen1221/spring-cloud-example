package com.littlefox.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "EUREKACLIENT")
public interface HelloService {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    String sayHello();
}
