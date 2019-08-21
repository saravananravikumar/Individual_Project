package com.project.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signupsuccess")
public class SignUpSuccessController {
    @GetMapping
    public String sign(){
        return "signupsuccess";
    }
}
