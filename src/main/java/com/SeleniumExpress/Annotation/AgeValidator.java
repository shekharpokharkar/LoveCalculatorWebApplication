package com.SeleniumExpress.Annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

	private int lower;
	private int higher;

	@Override
	public void initialize(Age age) {

		System.out.println("Inside AgeValidated initialze method");

		this.higher = age.max();
		this.lower = age.min();

	}

	@Override
	public boolean isValid(Integer typedAgeValue, ConstraintValidatorContext context) {

		System.out.println("Inside AgeValidated isValid method");
		
		if (typedAgeValue == null) {
			return false;
		}
		if (typedAgeValue < lower || typedAgeValue > higher) {
			return false;
		}

		return true;
	}

}
