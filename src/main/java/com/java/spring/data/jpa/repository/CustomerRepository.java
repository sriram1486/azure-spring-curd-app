package com.java.spring.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.spring.data.jpa.entity.Customer;


@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Long>{

}
