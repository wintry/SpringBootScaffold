package com.wkzd.springbootscaffold.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;


@RestController
public class HelloController {


    @Value("${myname}")
    private String name;

    @RequestMapping("/hello")
    public String index() {

        return name;
    }

}
