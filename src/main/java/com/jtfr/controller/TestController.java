package com.jtfr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "com.jtfr.Application.test";
    }

    @GetMapping()
    public String testGet() {
        return "com.jtfr.Application+testGet";
    }
    @PostMapping()
    public String testPost() {
        return "com.jtfr.Application+testPost";
    }
}
