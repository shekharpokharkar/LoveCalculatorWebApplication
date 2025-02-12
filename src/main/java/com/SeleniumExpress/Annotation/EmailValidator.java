package com.SeleniumExpress.Annotation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.SeleniumExpress.DTO.RegistrationDTO;

public class EmailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		System.out.println("===============Email Validator Supports==========");
		
		return RegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {

		System.out.println("Inside Email Validator validate Method");

		String email = ((RegistrationDTO) object).getContact().getEmail();
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contact.email", "Email.empty", "* Email Can't be empty");

		if (!email.endsWith("@seleniumExpress.com")) {
			errors.rejectValue("contact.email","Email.InvalidDomain","* Email Must be ends with seleniumExpress");
		}
		System.out.println("*************************************");
	}

}
