package com.msita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogPageController {
    @GetMapping("/blog")
    public String blogPage(){
        return "blog";
    }
}
