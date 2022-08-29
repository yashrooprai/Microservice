package com.customer.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>{
	
	public Customer findByDateOfBirthAndEmailAddress(LocalDate datedateOfBirth,String emailAddress);
	public Customer findByUniqueIdNumber(String uniqueid);
	
}
