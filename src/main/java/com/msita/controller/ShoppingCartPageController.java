package com.msita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShoppingCartPageController {
    @GetMapping("/shopping_cart")
    public String shoppingCartPage(){
        return "shopping_cart";
    }
}
