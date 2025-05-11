package com.fakestoredev.fakestoreproductservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SampleController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("dear")
    public String sayDear() {
        return "Dear World";
    }
}
