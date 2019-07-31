package com.msita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactPageController {
    @GetMapping("/contact")
    public String contactPage(){
        return "contact";
    }
}
