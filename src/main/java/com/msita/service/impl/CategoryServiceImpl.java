package com.msita.service.impl;

import com.msita.dao.CategoryDao;
import com.msita.entity.CategoryEntity;
import com.msita.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;
    @Transactional
    public void createCategory(final CategoryEntity categoryEntity){
        categoryDao.createCategory(categoryEntity);
    }
    @Transactional
    public List<CategoryEntity>getAllCategories(){
        return categoryDao.getAllCategories();
    }
    @Transactional
    public CategoryEntity getCategoryEntity(int categoryId){
        return categoryDao.getCategoryEntity(categoryId);
    }
}
