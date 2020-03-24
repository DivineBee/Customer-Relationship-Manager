package com.triss.springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	@NotNull(message="is required")
	@Size(min=2, message="is required")
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=2, message="is required")
	private String lastName;
	
	@NotNull(message="is required")
	@Min(value=0, message="must be greater than 0")
	@Max(value=10, message="must be smaller than 10")
	//if its int it will give a big error message which is not required
	// so use wrapper classes
	private Integer freePasses; 
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String ID;

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
	
	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
}
