package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {
	
	// controller method to show form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";	// actual helloworld-form jsp form
	}
	
	// controller method to process form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";		// actual helloworld jsp page
	}
	
	@RequestMapping("/shoutForm")
	public String shoutForm() {
		return "shout-form";
	}
	
	// controller method to read new form data
	// and add data to the model
	@RequestMapping("/shoutResult")
	public String letsShout(HttpServletRequest request, Model model) {
		
		// read request param from HTML form
		String msg = request.getParameter("shoutInput");
		
		// convert data to all caps and create message
		String result = "Yo, " + msg.toUpperCase() + "!";
		
		// add message to model
		model.addAttribute("shoutOutput", result);
		
		return "shout-result";
	}
	
	
	@RequestMapping("/shoutResultV2")
	public String letsShoutV2(@RequestParam("shoutInput") String shoutInput, Model model) {
		
		// convert data to all caps and create message
		String result = "Howdy, " + shoutInput.toUpperCase() + "!";
		
		// add message to model
		model.addAttribute("shoutOutput", result);
		
		return "shout-result";
	}
	
	
	

}
