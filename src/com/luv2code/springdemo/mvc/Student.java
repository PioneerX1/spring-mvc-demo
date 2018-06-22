package com.luv2code.springdemo.mvc;

public class Student {

	private String firstName;
	private String lastName;
	
	public Student() {
		// no-arg constructor
	}

	// using a Spring form on student-form.jsp, Spring automatically calls these getters & setters now
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
