package com.msita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductDetailsPageController {
    @GetMapping("/product_details")
    public String productDetailsPage(){
        return "product_details";
    }
}
