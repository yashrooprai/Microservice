package com.customer.service;

import org.springframework.stereotype.Service;

import com.customer.entity.CustomerIdentity;

@Service
public interface CustomerIdentityServices {
	public CustomerIdentity verificationCustomerIdentity (String firstname,String lastname) ;
}	