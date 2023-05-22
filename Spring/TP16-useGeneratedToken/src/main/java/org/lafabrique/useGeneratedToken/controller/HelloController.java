package org.lafabrique.useGeneratedToken.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {
    @GetMapping("/getHello")
    public String getHello() {
        return "hello";
    }

    @GetMapping("/admin/getAdminHello")
    public String getAdminHello() {
        return "hello Admin";
    }
}
