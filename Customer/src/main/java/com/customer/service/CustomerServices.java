package com.customer.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.customer.dto.SimDetailsDTO;
import com.customer.entity.Customer;

@Service
public interface CustomerServices {
	public Customer verifycustomerbasicdetail(LocalDate dateOfBirth,String emailid);
	public Customer VerifyIdProof(String idNumber);
	public SimDetailsDTO verifysimstatus(int simId);
	public void updatesimstatus(String status,int simid);
	
}
