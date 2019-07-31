package com.msita.dao.impl;

import com.msita.dao.CategoryDao;
import com.msita.entity.CategoryEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void createCategory(final CategoryEntity categoryEntity){
        final Session session = sessionFactory.getCurrentSession();
        session.save(categoryEntity);
    }
    public List<CategoryEntity>getAllCategories(){
        final Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM CategoryEntity");
        return query.list();
    }
    public CategoryEntity getCategoryEntity(int categoryId){
        Session session = sessionFactory.getCurrentSession();
        return session.get(CategoryEntity.class , categoryId);
    }
}
