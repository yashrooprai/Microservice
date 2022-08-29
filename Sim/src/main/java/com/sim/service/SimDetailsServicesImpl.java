package com.sim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sim.dto.SimDetailsDTO;
import com.sim.entity.SimDetails;
import com.sim.entity.SimOffers;
import com.sim.repository.GetSimStatusRepository;
import com.sim.repository.SimDetailsRepository;
import com.sim.repository.SimOffersRepository;

@Service
public class SimDetailsServicesImpl implements SimDetailsServices{

	@Autowired
	public SimDetailsRepository simDetailsRepository;
	@Autowired
	public SimOffersRepository simOffersRepository;
	@Autowired
	public GetSimStatusRepository getSimStatisRepository;
	@Override
	public SimDetails verificationservice(String simnumber, String servicenumber)
	{
		return simDetailsRepository.findBySimNumerAndServiceNumber(simnumber, servicenumber);	
	}

	@Override
	public SimOffers getSimOfferDetails(int simid) {
		return  simOffersRepository.findBySimid(simid);
	}

	@Override
	public SimDetailsDTO getsimPlans(int simid) {
		return SimDetailsDTO.valueOf(getSimStatisRepository.findBySimId(simid));
	}
	
}