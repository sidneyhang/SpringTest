package com.tinthon.oa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sidne on 2017/6/28.
 */
@RestController
public class HomeController {

    @GetMapping("/hello")
    public String hello() {
        return "hello,world";
    }
}
