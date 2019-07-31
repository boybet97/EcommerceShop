package com.msita.controller;

import com.msita.entity.CategoryEntity;
import com.msita.entity.ProductEntity;
import com.msita.form.ProductForm;
import com.msita.service.CategoryService;
import com.msita.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/createProduct")
    public String createProduct(final Model model){
        model.addAttribute("productForm" , new ProductForm());
        return "create_product";
    }
    @PostMapping("/createProduct")
    public String doCreateProduct(@ModelAttribute("productForm") ProductForm productForm , final Model model){
        ProductEntity productEntity = new ProductEntity();
        productEntity.setName(productForm.getName());
        productEntity.setDescription(productForm.getDescription());
        productEntity.setPrice(productForm.getPrice());
        final int categoryId = productForm.getCategoryId();
        CategoryEntity categoryEntity = categoryService.getCategoryEntity(categoryId);
        productEntity.setCategory(categoryEntity);
        productService.createProduct(productEntity);
        return "redirect:/";
    }
    @ModelAttribute("categories")
    public Map<Integer , String> getCategories(){
        Map<Integer , String> categories = new HashMap<Integer, String>();
        List<CategoryEntity> categoryList = categoryService.getAllCategories();
        if (categoryList == null){
            return categories;
        }
        for (int i = 0 ; i < categoryList.size() ; ++i){
            CategoryEntity categoryEntity = categoryList.get(i);
            categories.put(categoryEntity.getId() , categoryEntity.getName());
        }
        return categories;
    }

}
