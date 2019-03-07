package com.example.dev.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by ltf on 2019/3/6 0006.
 */
@ConfigurationProperties(prefix = "com.example.dev")
public class ConfigBean {
    private String name;
    private String wanna;

    public void setName(String name) {
        this.name = name;
    }

    public void setWanna(String wanna) {
        this.wanna = wanna;
    }

    public String getName() {
        return name;
    }

    public String getWanna() {
        return wanna;
    }
}
