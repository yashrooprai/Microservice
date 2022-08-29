package com.sim.service;

import org.springframework.stereotype.Service;

import com.sim.dto.SimDetailsDTO;
import com.sim.entity.SimDetails;
import com.sim.entity.SimOffers;
@Service
public interface SimDetailsServices {	
	
	public SimDetails verificationservice(String simnumber, String servicenumber);
	public SimOffers getSimOfferDetails(int simid);
	public SimDetailsDTO getsimPlans(int simid);
}