package com.findone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo on 2017/9/6.
 */
@Controller
@RequestMapping("/helloWord")
public class HelloWord {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
