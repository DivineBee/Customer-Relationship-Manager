package com.triss.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	//add an initbinder to convert trim input strings
	//remove leading and trailing whitespace
	//resolve issue for validation
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//create customer object
		Customer theCustomer = new Customer();
		
		//add customer object to the model
		theModel.addAttribute("customer", theCustomer);
		
		return "customer-form";
	}

	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult) {
		
		System.out.println("Binding result:" + theBindingResult);
		
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		}
		else {
		//log the input data
		/*System.out.println("theCustomer: " + theCustomer.getFirstName()
							 + " " + theCustomer.getLastName()); */
		return "customer-confirmation";
		}
	}
}