package com.java.spring.data.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.spring.data.jpa.entity.Customer;
import com.java.spring.data.jpa.repository.CustomerRepository;

@Service
public class CustomerService {
	
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer createCustomer( Customer customer){
		return customerRepository.save(customer);
	}
	
	public List<Customer> getCustomers(){
		return customerRepository.findAll();
	}
	
	public Optional<Customer> getCustomerById(Long customerId){
		return Optional.of(customerRepository.findById(customerId).get());
	}

}
