package com.lafabrique.TP142_securite.controller;

import com.lafabrique.TP142_securite.application.MyUserService;
import com.lafabrique.TP142_securite.domaine.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/hello")
public class HelloController {
    @Autowired
    MyUserService service;

    @GetMapping("/user")
    public String sayHelloUser() {
        return "hello user";
    }

    @GetMapping("/admin")
    public String sayHelloAdmin() {
        return "hello admin";
    }

    @GetMapping("/all")
    public String coucou() { return "hello anyone";}


    @PostMapping("/create")
    public void createUser(@RequestBody MyUser user) {
        service.createUser(user);
    }
}
