package com.SeleniumExpress.DTO;

public class CreaditCard {

	private Integer firstFourNumber;
	private Integer secondFourNumber;
	private Integer thirdFourNumber;
	private Integer fourthFourNumber;

	public Integer getFirstFourNumber() {
		return firstFourNumber;
	}

	public void setFirstFourNumber(Integer firstFourNumber) {
		this.firstFourNumber = firstFourNumber;
	}

	public Integer getSecondFourNumber() {
		return secondFourNumber;
	}

	public void setSecondFourNumber(Integer secondFourNumber) {
		this.secondFourNumber = secondFourNumber;
	}

	public Integer getThirdFourNumber() {
		return thirdFourNumber;
	}

	public void setThirdFourNumber(Integer thirdFourNumber) {
		this.thirdFourNumber = thirdFourNumber;
	}

	public Integer getFourthFourNumber() {
		return fourthFourNumber;
	}

	public void setFourthFourNumber(Integer fourthFourNumber) {
		this.fourthFourNumber = fourthFourNumber;
	}

	@Override
	public String toString() {
		return firstFourNumber + "-" + secondFourNumber + "-" + thirdFourNumber + "-" + fourthFourNumber;
	}

	public CreaditCard() {
		
	}

	

}
