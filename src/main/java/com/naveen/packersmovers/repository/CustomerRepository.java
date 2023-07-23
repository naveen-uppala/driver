package com.naveen.packersmovers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naveen.packersmovers.model.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}

