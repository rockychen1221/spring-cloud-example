package com.littlefox.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String helloService() {
        return restTemplate.getForObject("http://EUREKACLIENT/",String.class);
    }
}
