package com.customer.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.dto.SimDetailsDTO;
import com.customer.entity.Customer;
import com.customer.service.CustomerCircuitBreaker;
import com.customer.service.CustomerServices;
import com.customer.validation.ValidateIdProof;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.vavr.concurrent.Future;


@RestController
@RequestMapping(value = "/customer/idproof")
@Validated
public class IdProofValidationController {
	@Autowired
	private CustomerServices customerServices;
	
	@Autowired
	CustomerCircuitBreaker circuitBreaker;
	
	@CircuitBreaker(name = "CustomerMs", fallbackMethod = "validateIdproofFallback") 
	@PutMapping(value = "/validate")
	public ResponseEntity<String> validateIdproof(@Valid @RequestBody ValidateIdProof val){
		Customer customer = customerServices.VerifyIdProof(val.getIdNumber());
		
		if(customer == null)
		{
			return ResponseEntity.ok("Invalid details");
		}
		else {
			if(customer.getFirstName().matches(val.getFirstname()) && 
					customer.getLastName().matches(val.getLastname())&&
					customer.getDateOfBirth().equals(val.getDobDate())) 
		{

			Integer simId = customer.getSimId();			
			Future<SimDetailsDTO> simdetailsdto = circuitBreaker.getSimDetailsDTO(simId);
			
			if(simdetailsdto.get().getSimStatus().matches("active")) 
				return ResponseEntity.ok("Sim status is active");
			
			else if(simdetailsdto.get().getSimStatus().matches("inactive")) {
				customerServices.updatesimstatus("active", customer.getSimId());
				return ResponseEntity.ok("sim status is activated");
				}
			
			else {
				return ResponseEntity.ok("Enter Valid Details");
			}
			
			
		}
			else {
				return ResponseEntity.ok("Invalid Details");
			}
			
		}
	}

	public ResponseEntity<String> validateIdproofFallback(ValidateIdProof val, Throwable throwable)
	{
		return ResponseEntity.ok("Fall Back, Getting microservices error");
	}	
}

