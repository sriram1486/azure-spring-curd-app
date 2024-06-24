package com.java.spring.data.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Customer {
	
	@Id
	@GeneratedValue
	private Long customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String gender;
	private String address;

}
