package com.naveen.packersmovers.service;

import java.util.List;

import com.naveen.packersmovers.model.Customer;

public interface PackersMoversService {
    public Customer saveUser(Customer customer);
    public List<Customer> getAllCustomers();
   
    
}
