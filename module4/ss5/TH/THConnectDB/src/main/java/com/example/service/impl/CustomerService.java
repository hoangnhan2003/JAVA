package com.example.service.impl;

import com.example.model.Customer;
import com.example.service.ICustomerService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    @Override
    public List<Customer> findAll() {
        return Collections.emptyList();
    }

    @Override
    public Customer findOne(long id) {
        return null;
    }

    @Override
    public void save(Customer customer) {

    }

    @Override
    public void save(List<Customer> customerList) {

    }

    @Override
    public boolean exists(long id) {
        return false;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void delete(Customer customer) {

    }

    @Override
    public void delete(List<Customer> customerList) {

    }

    @Override
    public void deleteAll() {

    }
}
