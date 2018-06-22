package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	//private LinkedHashMap<String, String> countryOptions;
	private String favLang;
	private String[] operatingSystems;
	
	public Student() {
		// no-arg constructor
		// populate country options: using ISO code
//		countryOptions = new LinkedHashMap<>();
//		countryOptions.put("BR", "Brazil");
//		countryOptions.put("FR", "France");
//		countryOptions.put("DE", "Germany");
//		countryOptions.put("IN", "India");
//		countryOptions.put("LT", "Lithuania");
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

	public String getCountry() {
		return country;
	}

	// on submit form, Spring will call setCountry() method
	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavLang() {
		return favLang;
	}

	public void setFavLang(String favLang) {
		this.favLang = favLang;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

//	public LinkedHashMap<String, String> getCountryOptions() {
//		return countryOptions;
//	}
	
}
