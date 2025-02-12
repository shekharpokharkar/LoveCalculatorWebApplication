package com.SeleniumExpress.Annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = PhoneNumberValidator.class)
public @interface Phone1 {

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	int max() default 12;

	int min() default 10;
	
	String message() default "Phone Number Must be 10 digits";

}
