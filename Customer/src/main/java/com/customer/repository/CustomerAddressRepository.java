package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.entity.CustomerAddress;

@Repository
public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Integer>{

			//@Query(value = "select * from CustomerAddress where addressId = ?1 ")
			public CustomerAddress findByAddressId(int aaddressId);

}
