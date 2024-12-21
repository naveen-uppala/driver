package com.naveen.packersmovers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naveen.packersmovers.model.Driver;


@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {

}

