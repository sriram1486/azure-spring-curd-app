package com.java.spring.data.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.spring.data.jpa.entity.Customer;
import com.java.spring.data.jpa.service.CustomerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/createCustomer")
	public Customer createCustomer(@RequestBody Customer customer) {
		
		return customerService.createCustomer(customer);
		
	}
	
	@GetMapping("/customers")
	public List<Customer> getCustomerDetails(){
		return customerService.getCustomers();
		
	}
	
	@GetMapping("/customers/{customerById}")
	public Customer getCustomerDetails(@PathVariable("customerById") Long customerById){
		return customerService.getCustomerById(customerById).get();
		
	}
	

}
