package com.msita.service.impl;

import com.msita.dao.ProductDao;
import com.msita.entity.ProductEntity;
import com.msita.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Transactional
    public void createProduct(final ProductEntity productEntity){
        productDao.createProduct(productEntity);
    }
}
