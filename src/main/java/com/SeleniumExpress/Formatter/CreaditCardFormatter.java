package com.SeleniumExpress.Formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.SeleniumExpress.DTO.CreaditCard;

public class CreaditCardFormatter implements Formatter<CreaditCard> {

	@Override
	public String print(CreaditCard creditCardNumber, Locale locale) {
		
		System.out.println("Inside PRINT Method of CreditCARD Formatter");
		
		return String.valueOf(creditCardNumber.getFirstFourNumber())+"-"+
		String.valueOf(creditCardNumber.getSecondFourNumber())+"-"+
		String.valueOf(creditCardNumber.getThirdFourNumber())+"-"+
		String.valueOf(creditCardNumber.getFourthFourNumber());
		
	}


	@Override
	public CreaditCard parse(String creditCardNumber1, Locale locale) throws ParseException {
		
		System.out.println("Inside PARSE Method of CreditCARD Formatter");
		String[] split = creditCardNumber1.split("-");
		
		CreaditCard creditCardNumber = new CreaditCard();
		creditCardNumber.setFirstFourNumber(Integer.valueOf(split[0]));
		creditCardNumber.setSecondFourNumber(Integer.valueOf(split[1]));
		creditCardNumber.setThirdFourNumber(Integer.valueOf(split[2]));
		creditCardNumber.setFourthFourNumber(Integer.valueOf(split[3]));
		
		return creditCardNumber;
	}

	
}
