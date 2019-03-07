package com.example.dev.controller;

import com.example.dev.bean.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ltf on 2019/3/6 0006.
 */
@RestController
public class UserObjectController {
    @Autowired
    ConfigBean configBean;

    @RequestMapping("/")
    public String hell(){
        return configBean.getName()+configBean.getWanna();
    }
}
