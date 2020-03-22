package com.triss.springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	@NotNull(message="is required")
	@Size(min=2, message="is required")
	private String firstName;
	@NotNull(message="is required")
	@Size(min=2, message="is required")
	private String lastName;
	private String country;
	private String jobPosition;
	private String[] operatingSystems;
	
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> jobOptions;
	
	public Customer() {
		//populate country options used iso country code
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("MD", "Moldova");
		countryOptions.put("RO", "Romania");
		countryOptions.put("UKR", "Ukraine");
		countryOptions.put("FR", "France");
		countryOptions.put("CN", "China");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States");
		
		jobOptions = new LinkedHashMap<>();
		jobOptions.put("CEO", "CEO");
		jobOptions.put("Java Developer", "Java Developer");
		jobOptions.put("C# Developer", "C# Developer");
		jobOptions.put("PHP Developer", "PHP Developer");
		jobOptions.put("Software Engineer", "Software Engineer");
		
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public LinkedHashMap<String, String> getJobOptions() {
		return jobOptions;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
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

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
}
