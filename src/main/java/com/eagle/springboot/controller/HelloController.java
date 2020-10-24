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
        // println output to console
        Date curDate = new Date();
        System.out.println("date:" + curDate);
        return "Simple Hello! The port is "+port+"; Current time is: "+curDate;
    }
}
