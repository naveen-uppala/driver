package com.naveen.packersmovers.service;

import java.util.List;

import com.naveen.packersmovers.model.Driver;

public interface PackersMoversService {
    public Driver saveUser(Driver driver);
    public List<Driver> getAllDrivers();
   
    
}
