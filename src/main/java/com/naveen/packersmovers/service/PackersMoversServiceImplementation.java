package com.naveen.packersmovers.service;

import com.naveen.packersmovers.model.Customer;
import com.naveen.packersmovers.repository.CustomerRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PackersMoversServiceImplementation  implements  PackersMoversService {

    @Autowired
    private CustomerRepository userRepository;


    @Override
    public  Customer saveUser(Customer customer) {
        return  userRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return userRepository.findAll();
    }
   
}
