package com.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.entity.CustomerIdentity;
import com.customer.repository.CustomerIdentityRepository;

@Service
public class CustomerIdentityServicesImpl implements CustomerIdentityServices{

	@Autowired
	private CustomerIdentityRepository customerIdentityRepository;
	@Override
	public CustomerIdentity verificationCustomerIdentity(String firstname, String lastname) {
		return customerIdentityRepository.findByFirstNameAndLastName(firstname, lastname);		
	}

}