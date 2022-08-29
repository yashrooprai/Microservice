package com.customer.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

//Entity class that should be passed around for DB related operations
@Entity 
public class Customer 
{
	//Annotation that helps marking a field as the primary key
	@Id 
	@Column(name = "uniqueIdNumber")
	private String uniqueIdNumber;
	@Column(name = "dateOfBirth")
	@DateTimeFormat(pattern = "yyyy-dd-mm")
	private LocalDate dateOfBirth;
	@Column(name = "emailAdress")
	private String emailAddress;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "idType")
	private String idType;
	private int customerAddress_addressId;
//	@JoinColumn(name = "simId")
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	private SimDetails simDetails;
	@Column(name = "simId")
	private Integer simId;
	@Column(name = "state")
	private String state;
	public String getUniqueIdNumber() {
		return uniqueIdNumber;
	}
	public void setUniqueIdNumber(String uniqueIdNumber) {
		this.uniqueIdNumber = uniqueIdNumber;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public int getCustomerAddress_addressId() {
		return customerAddress_addressId;
	}
	public void setCustomerAddress_addressId(int customerAddress_addressId) {
		this.customerAddress_addressId = customerAddress_addressId;
	}
	public Integer getSimId() {
		return simId;
	}
	public void setSimId(Integer simId) {
		this.simId = simId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Customer(String uniqueIdNumber, LocalDate dateOfBirth, String emailAddress, String firstName,
			String lastName, String idType, int customerAddress_addressId, Integer simId, String state) {
		super();
		this.uniqueIdNumber = uniqueIdNumber;
		this.dateOfBirth = dateOfBirth;
		this.emailAddress = emailAddress;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idType = idType;
		this.customerAddress_addressId = customerAddress_addressId;
		this.simId = simId;
		this.state = state;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	


	
}
