package com.msita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SingleBlogPageController {
    @GetMapping("/single_blog")
    public String singleBlogPage(){
        return "single_blog";
    }
}
