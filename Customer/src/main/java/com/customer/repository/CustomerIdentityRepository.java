package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.entity.CustomerIdentity;

@Repository
public interface CustomerIdentityRepository extends JpaRepository<CustomerIdentity, Long>{
	
	public CustomerIdentity findByFirstNameAndLastName(String firstname,String lastname);
}

