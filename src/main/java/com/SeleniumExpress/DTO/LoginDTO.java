package com.SeleniumExpress.DTO;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class LoginDTO {

	@NotEmpty(message = "* UserName Cant be Empty")
	@Size(min = 2, max = 10, message = "* UserName Size Must be in between 2-10")
	private String userName;

	@NotBlank(message = "* CrushName can't be blank")
	@Size(min = 2, max = 15, message = "* CrushName Size Must be in between 2-15")
	private String crushName;

	@AssertTrue(message = "* check terms and conditions")
	private boolean termsAndConditions;

	private String result;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	public LoginDTO() {

	}

	@Override
	public String toString() {
		return "LoginDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}

	public boolean isTermsAndConditions() {
		return termsAndConditions;
	}

	public void setTermsAndConditions(boolean termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
