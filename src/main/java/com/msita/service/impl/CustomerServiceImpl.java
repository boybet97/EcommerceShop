package com.msita.service.impl;

import com.msita.dao.CustomerDao;
import com.msita.entity.CustomerEntity;
import com.msita.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    @Transactional
    public void registerCustomer(final CustomerEntity customerEntity){
        customerDao.registerCustomer(customerEntity);
    }
}
