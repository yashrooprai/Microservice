package com.customer.service;

import org.springframework.stereotype.Service;

@Service
public interface CustomerAddressServices {
	public String updationCustomerAddress(int addressId, int pincode,String add,String city,String State);
}
