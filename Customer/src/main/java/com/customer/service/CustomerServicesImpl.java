package com.customer.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.dto.SimDetailsDTO;
import com.customer.entity.Customer;
import com.customer.repository.CustomerRepository;
//import com.customer.repository.SimDetailsRepository;

@Service
public class CustomerServicesImpl implements CustomerServices{

	@Autowired
	private CustomerRepository customerRepository;
	
//	@Autowired
//	private SimDetailsRepository simDetailsRepository;
	
	@Override
	public Customer verifycustomerbasicdetail(LocalDate dateOfBirth, String emailid) {
		return customerRepository.findByDateOfBirthAndEmailAddress(dateOfBirth, emailid);
	}
	@Override
	public Customer VerifyIdProof(String idNumber) {
		return customerRepository.findByUniqueIdNumber(idNumber);
	}
	@Override
	public SimDetailsDTO verifysimstatus(int simid) {
		return null;
//		return simDetailsRepository.verifysimstatus(simid);

		
	}
	@Override
	public void updatesimstatus(String status, int simid) {
//		simDetailsRepository.updateSimStatus(status, simid);		
	}
	
}
