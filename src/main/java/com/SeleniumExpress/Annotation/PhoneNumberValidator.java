package com.SeleniumExpress.Annotation;

import com.SeleniumExpress.DTO.Phone;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<Phone1,Phone > {

	@Override
	public boolean isValid(Phone phone, ConstraintValidatorContext context) {
		System.out.println("Inside PhoneValidator isValid Method");
		System.out.println(phone);
		
		return false;
	}

	

}
