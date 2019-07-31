package com.msita.service;

import com.msita.entity.CategoryEntity;

import java.util.List;

public interface CategoryService {
    void createCategory(final CategoryEntity categoryEntity);
    List<CategoryEntity>getAllCategories();
    CategoryEntity getCategoryEntity(int categoryId);
}
