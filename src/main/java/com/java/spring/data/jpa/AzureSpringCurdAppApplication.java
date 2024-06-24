package com.java.spring.data.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.spring.data.jpa.entity.Customer;
import com.java.spring.data.jpa.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class AzureSpringCurdAppApplication implements CommandLineRunner {
	
	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(AzureSpringCurdAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		List<Customer> list= new ArrayList<>();
		
		Customer cust= new Customer();
		cust.setFirstName("Sriram");
		cust.setLastName("nagireddy");
		cust.setEmail("sriram@gmail.com");
		cust.setPhone("1223111");
		cust.setGender("Male");
		cust.setAddress("Bangalore");
		Customer cust1= new Customer();
		cust1.setFirstName("Siva");
		cust1.setLastName("nagireddy");
		cust1.setEmail("siva@gmail.com");
		cust1.setPhone("1223111333");
		cust1.setGender("Male");
		cust1.setAddress("Hyderabad");
		list.add(cust);
		list.add(cust1);
		customerRepository.saveAll(list);
	}

}
