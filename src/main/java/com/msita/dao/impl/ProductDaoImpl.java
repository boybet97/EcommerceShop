package com.msita.dao.impl;

import com.msita.dao.ProductDao;
import com.msita.entity.ProductEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void createProduct(final ProductEntity productEntity){
        final Session session = sessionFactory.getCurrentSession();
        session.save(productEntity);
    }
}
