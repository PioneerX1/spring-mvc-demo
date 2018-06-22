package com.luv2code.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;

	// show form
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		// create new student object
		Student student = new Student();
		
		// add student object to the model
		model.addAttribute("student", student);
		
		// add country options from countries.properties to the model
		model.addAttribute("countryOptions", countryOptions);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		// log the input data to verify Spring brought it in
		System.out.println("student: " + student.getFirstName() + " " + student.getLastName()
				+ " " + student.getCountry());
		return "student-confirmation";
	}
	
	
	
}
