package com.shuang.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangshuang
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }
    
    @PostMapping("/hello2")
    public String sayHello2() {
        return "Hello2";
    }

    @PutMapping("/hello3")
    public String sayHello3() {
        return "Hello3";
    }

}
