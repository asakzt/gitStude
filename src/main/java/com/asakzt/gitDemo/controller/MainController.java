package com.asakzt.gitDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/main")
    public String mainPage() {
        return "Hello World";
    }

    @GetMapping("/{user}")
    public String userPage(@PathVariable("user") String user) {
        return String.format("Hello $s!!!!!!!!!!", user);
    }

    @GetMapping("/timeNow")
    public String userPage(@PathVariable("user") String user) {
        return String.format("Time : $s", 12345);
    }

}
