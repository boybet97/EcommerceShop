package com.msita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfirmationPageController {
    @GetMapping("/confirmation")
    public String confirmationPage(){
        return "confirmation";
    }
}
