package com.eagle.springboot.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String sayHello(){
        System.out.println("date:" + new Date());
        return "Simple Hello! The port is "+port;
    }
}
