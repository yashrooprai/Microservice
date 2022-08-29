package com.sim.validation;

import javax.validation.constraints.Pattern;

public class ValidateSimDetail {
	@Pattern(regexp = "[0-9]{13}",message = "Invalid sim number")
	private String simnumber;
	@Pattern(regexp = "[0-9]{10}" , message = "Invalid service number")
	private String servicenumber;

	

	public ValidateSimDetail(@Pattern(regexp = "[0-9]{13}", message = "Invalid sim number") String simnumber,
			@Pattern(regexp = "[0-9]{10}", message = "Invalid service number") String servicenumber) {
		super();
		this.simnumber = simnumber;
		this.servicenumber = servicenumber;
	}
	public String getSimnumber() {
		return simnumber;
	}
	public void setSimnumber(String simnumber) {
		this.simnumber = simnumber;
	}
	public String getServicenumber() {
		return servicenumber;
	}
	public void setServicenumber(String servicenumber) {
		this.servicenumber = servicenumber;
	}
	public ValidateSimDetail() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ValidateCustomer [simnumber=" + simnumber + ", servicenumber=" + servicenumber + "]";
	}
}