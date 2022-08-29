package com.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.repository.AddCustomerAddressRepository;
import com.customer.repository.CustomerAddressRepository;
import com.customer.repository.UpdateCustomerAddressRepository;

@Service
public class CustomerAddressServicesImpl implements CustomerAddressServices 
{

	@Autowired
	private CustomerAddressRepository customerAddressRepository;
	
	@Autowired
	private AddCustomerAddressRepository addCustomerAddressRepository;
	
	@Autowired
	private UpdateCustomerAddressRepository updateCustomerAddressRepository;
	@Override
	public String updationCustomerAddress(int addressId, int pincode, String add, String city, String State) {
		if(customerAddressRepository.findByAddressId(addressId) == null)
		{
			addCustomerAddressRepository.InsertCustomerAddress(pincode, add, city, State);
			return "New Address added Sucessfully";
		}
		else {
			updateCustomerAddressRepository.updateCustomerAddress(pincode, add, city, State);
			return "Address Updated Sucessfully";
		}
		
	}

}
