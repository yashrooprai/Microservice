package com.customer.validation;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

public class ValidateCustomerBasicDetail {
	@NotNull(message = "Emailid is Empty")
	@Email(message = "Email id not in format")
	private String emailid;
	@Past(message = "That's impossible.")
	@NotNull(message = "DOB is empty")
	@DateTimeFormat(pattern = "yyyy-dd-mm")
	private LocalDate birthdate;
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	@Override
	public String toString() {
		return "ValidateCustomerBasicDetail [emailid=" + emailid + ", birthdate=" + birthdate + "]";
	}
	
	
}