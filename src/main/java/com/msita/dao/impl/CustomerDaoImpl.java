package com.msita.dao.impl;

import com.msita.dao.CustomerDao;
import com.msita.entity.CustomerEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void registerCustomer(final CustomerEntity customerEntity){
        final Session session = sessionFactory.getCurrentSession();
        session.save(customerEntity);
    }
}
