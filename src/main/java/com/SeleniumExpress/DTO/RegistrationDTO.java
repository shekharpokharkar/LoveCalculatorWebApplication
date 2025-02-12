package com.SeleniumExpress.DTO;

import java.util.Arrays;

import com.SeleniumExpress.Annotation.Age;

import jakarta.validation.constraints.NotEmpty;

public class RegistrationDTO {

	@NotEmpty(message = "* country cant be Null")
	private String userName;
	private char[] password;
	private String name;
	@NotEmpty(message = "* country cant be Null")
	private String country;
	private String gender;
	//@Age(min=18,max=75,message="Age should be inbetween 18-75")
	@Age(min=18,max=75)
	private Integer age;
	private String[] hobbies;
	
	private CommunicationDTO contact;
	
	private BillDTO details;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public CommunicationDTO getContact() {
		return contact;
	}

	public void setContact(CommunicationDTO contact) {
		this.contact = contact;
	}

	public BillDTO getDetails() {
		return details;
	}

	public void setDetails(BillDTO details) {
		this.details = details;
	}

	public RegistrationDTO() {

	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "RegistrationDTO [userName=" + userName + ", password=" + Arrays.toString(password) + ", name=" + name
				+ ", country=" + country + ", gender=" + gender + ", age=" + age + ", hobbies="
				+ Arrays.toString(hobbies) + ", contact=" + contact + ", details=" + details + "]";
	}

}
