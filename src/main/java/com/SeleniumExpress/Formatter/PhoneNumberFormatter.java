package com.SeleniumExpress.Formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.SeleniumExpress.DTO.Phone;

public class PhoneNumberFormatter implements Formatter<Phone>{

	@Override
	public String print(Phone phone, Locale locale) {
		
		System.out.println("Inside print Method of PhoneNumber formatter");
		
		return phone.getCountryCode()+"-"+phone.getPhoneNumber();
	}

	@Override
	public Phone parse(String phoneNumber, Locale locale) throws ParseException {
	
		System.out.println("Inside parse Method of PhoneNumber formatter");
		
		String[] split = phoneNumber.split("-");
		
		Phone p=new Phone();
		p.setCountryCode(split[0]);
		p.setPhoneNumber(split[1]);
		
		return p;
	}

}
