package com.yzbbanban.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by brander on 2018/7/17
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${from:test}")
    private String from;

    @RequestMapping("/from")
    public String from() {

        return this.from;
    }
}
