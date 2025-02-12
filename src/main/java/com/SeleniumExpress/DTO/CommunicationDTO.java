package com.SeleniumExpress.DTO;

import com.SeleniumExpress.Annotation.Phone1;

public class CommunicationDTO {

	private String email;
	
	@Phone1(max = 12,min = 10,message = "phone Number ")
	private Phone phone;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "CommunicationDTO [email=" + email + ", phone=" + phone + "]";
	}

}
