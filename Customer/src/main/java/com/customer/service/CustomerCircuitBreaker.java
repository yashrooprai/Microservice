package com.customer.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.customer.dto.SimDetailsDTO;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.vavr.concurrent.Future;

@Service
public class CustomerCircuitBreaker {
	
	@CircuitBreaker(name = "Customer")
	public Future<SimDetailsDTO> getSimDetailsDTO(Integer simId){
		return Future.of(()->new RestTemplate().getForObject("http://localhost:8086/sim/simdetailsof/"+simId, SimDetailsDTO.class));
	}
}
