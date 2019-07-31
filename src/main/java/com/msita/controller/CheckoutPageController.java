package com.msita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CheckoutPageController {
    @GetMapping("/checkout")
    public String checkoutPage(){
        return "product_checkout";
    }
}
