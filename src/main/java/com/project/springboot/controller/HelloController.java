package com.project.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {


    @RequestMapping("/")
    public String welcome() {
        return "index";
    }
}
