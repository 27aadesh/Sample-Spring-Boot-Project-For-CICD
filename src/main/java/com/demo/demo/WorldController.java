package com.demo.demo;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class WorldController {

    @GetMapping("/world")
    public String home() {
        return "Hello World from World COntroller";
    }    
}