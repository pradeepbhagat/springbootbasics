package com.atom.springbootbasics.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello") // Map this method to a URL
    public String hello() {
        return "Hi there!";
    }
}
