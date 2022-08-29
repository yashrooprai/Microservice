package com.customer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.entity.Customer;
import com.customer.service.CustomerAddressServices;
import com.customer.service.CustomerServices;
import com.customer.validation.ValidateUpdateDetail;

@RestController
@RequestMapping("/customer/update")
@Valid

// REPLACE WITH UIDN 
public class UpdateCustomerDetailsController {
	@Autowired
	private CustomerAddressServices customerAddressServices;
	
	@Autowired
	private CustomerServices customerServices;
	
	@PutMapping(value = "/validate/{uidn}")
	public ResponseEntity<String> validateAddreessDetails(@PathVariable String uidn, @Valid @RequestBody ValidateUpdateDetail vpd)
	{
		Customer cust = customerServices.VerifyIdProof(uidn);
		if (cust == null){
			String message = "Wrong UIDN entered";
			return ResponseEntity.ok(message);
			
		}	
		String message  = customerAddressServices.updationCustomerAddress((int) cust.getCustomerAddress_addressId(),
				(int) vpd.getPincode(), vpd.getAddress(), vpd.getCity(), vpd.getState());
		return ResponseEntity.ok(message);
	}
}
