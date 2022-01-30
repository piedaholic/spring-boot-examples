package com.piedaholic.helloworld.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@RestController
public class AppController {
    
    @GetMapping(value="/")
    public String defaultHello() {
        return "Hello World!";
    }

    @RequestMapping(value="/hello/{name}", method=RequestMethod.GET)
    public String hello(@PathVariable String name) {
        return new String("Hello " + name + "!");
    }
    
}
