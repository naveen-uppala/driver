package com.naveen.packersmovers.service;

import com.naveen.packersmovers.model.Driver;
import com.naveen.packersmovers.repository.DriverRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PackersMoversServiceImplementation  implements  PackersMoversService {

    @Autowired
    private DriverRepository userRepository;


    @Override
    public  Driver saveUser(Driver driver) {
        return  userRepository.save(driver);
    }

    @Override
    public List<Driver> getAllDrivers() {
        return userRepository.findAll();
    }
   
}
