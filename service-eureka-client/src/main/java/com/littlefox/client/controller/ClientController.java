package com.littlefox.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-11-14 15:26
 */
@RestController
public class ClientController {

    @RequestMapping( value = "/hi", method = RequestMethod.GET )
    public String test( @RequestParam String name ){
        return "hello " + name;
    }

}
