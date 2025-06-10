package com.recorder.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/hellolist")
    public List<String> hellolist(){
        return List.of("hello","world");
    }
}
