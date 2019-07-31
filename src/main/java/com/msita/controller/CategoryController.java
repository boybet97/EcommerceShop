package com.msita.controller;

import com.msita.entity.CategoryEntity;
import com.msita.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/createCategory")
    public String createCategory(){
        return "create_category";
    }
    @PostMapping("/createCategory")
    public String doCreateCategory(@RequestParam("categoryName") final String categoryName ){
        final CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setName(categoryName);
        categoryService.createCategory(categoryEntity);
        return "redirect:/";
    }
}
