package com.msita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ElementPageController {
    @GetMapping("/elements")
    public String elementPage(){
        return "elements";
    }
}
