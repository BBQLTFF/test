package com.example.dev.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ltf on 2019/3/5 0005.
 */
@RestController
@EnableAutoConfiguration
public class UserFieldController {
    @Value(value="${com.example.dev.name}")
    private  String name;
    @Value(value="${com.example.dev.wanna}")
    private String wanna;

    //@RequestMapping(value = "/",produces="application/json;charset=UTF-8")
    public String hello(){
        return name+wanna;
    }
}
