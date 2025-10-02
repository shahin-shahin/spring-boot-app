package com.shahin.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "testing message";
    }

    @GetMapping("/value/{value]")
    public String getValue(@PathVariable String value){
        return "Enter the value is : "+value;
    }
}
