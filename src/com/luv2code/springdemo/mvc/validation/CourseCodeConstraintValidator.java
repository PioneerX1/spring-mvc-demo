package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.value();
	}
	
	@Override
	public boolean isValid(String codeInput, ConstraintValidatorContext constraintValidatorContext) {
		
		boolean result;
		
		// need to check for null or you'll get NullPointerException
		if (codeInput != null) {
			result = codeInput.startsWith(coursePrefix);
		} else {
			result = true;
		}
			
		return result;
	}

}
