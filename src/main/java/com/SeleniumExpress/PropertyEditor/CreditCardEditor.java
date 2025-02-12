package com.SeleniumExpress.PropertyEditor;

import java.beans.PropertyEditorSupport;

import com.SeleniumExpress.DTO.CreaditCard;

public class CreditCardEditor extends PropertyEditorSupport {

	@Override
	public String getAsText() {
		
		CreaditCard creditCardNumber=(CreaditCard)getValue();
System.out.println("******************************");
		return String.valueOf(creditCardNumber.getFirstFourNumber())+"-"+
		String.valueOf(creditCardNumber.getSecondFourNumber())+"-"+
		String.valueOf(creditCardNumber.getThirdFourNumber())+"-"+
		String.valueOf(creditCardNumber.getFourthFourNumber());
	}

	@Override
	public void setAsText(String creditCardNumber1) throws IllegalArgumentException {

		String[] split = creditCardNumber1.split("-");
		System.out.println("*******++++++++++++++++++++++++*****");
		CreaditCard creditCardNumber = new CreaditCard();
		creditCardNumber.setFirstFourNumber(Integer.valueOf(split[0]));
		creditCardNumber.setSecondFourNumber(Integer.valueOf(split[1]));
		creditCardNumber.setThirdFourNumber(Integer.valueOf(split[2]));
		creditCardNumber.setFourthFourNumber(Integer.valueOf(split[3]));
		setValue(creditCardNumber);

	}

}
