package com.msita.dao;

import com.msita.entity.CategoryEntity;

import java.util.List;

public interface CategoryDao {
    void createCategory(final CategoryEntity categoryEntity);
    List<CategoryEntity> getAllCategories();
    CategoryEntity getCategoryEntity(int categoryId);
}
