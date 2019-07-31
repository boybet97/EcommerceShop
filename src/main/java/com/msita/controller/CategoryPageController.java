package com.msita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryPageController {
    @GetMapping("/category")
    public String categoryPage(){
        return "category";
    }
}
