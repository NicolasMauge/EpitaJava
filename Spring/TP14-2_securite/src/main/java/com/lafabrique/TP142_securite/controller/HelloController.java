package com.lafabrique.TP142_securite.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/hello")
public class HelloController {
    @GetMapping("/user")
    public String sayHelloUser() {
        return "hello user";
    }

    @GetMapping("/admin")
    public String sayHelloAdmin() {
        return "hello admin";
    }
}
