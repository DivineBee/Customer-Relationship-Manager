package com.triss.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	//controller method to show initial html form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//controller method to process html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//new a controller method to read form data and add
	//data to the model
	@RequestMapping("/processFormVersion2")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		//read the request param from html form
		String theName = request.getParameter("studentName");
		
		//convert data to caps
		theName = theName.toUpperCase();
		
		//create message
		String result = "Hey, you " + theName;
		
		//add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersion3")
	public String processFormVersion3(
			@RequestParam("studentName") String theName,
			Model model) {
		
		//convert data to caps
		theName = theName.toUpperCase();
		
		//create message
		String result = "Hey new friend! " + theName;
		
		//add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
}
