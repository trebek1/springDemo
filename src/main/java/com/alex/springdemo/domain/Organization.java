package com.alex.springdemo.domain;

import com.alex.springdemo.service.BusinessService;
import com.alex.springdemo.serviceimpl.CloudServiceImpl;
import com.alex.springdemo.serviceimpl.EcommerceServiceImpl;

public class Organization {
	private String companyName;
	private int yearOfIncorporation;
	private String postalCode;
	private int employeeCount;
	private String slogan;
	// bad tight coupling 
	//private BusinessService businessService = new EcommerceServiceImpl();
	//private BusinessService businessService = new CloudServiceImpl();
	// cant swap out cloud instead 
	
	private BusinessService businessService; 
	

	public Organization(String companyName, int yearOfIncorporation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String corporateSlogan() {
		return slogan; 
	}
	
	public String corporateService() {
		return businessService.offerService(companyName);
	}
	
	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", postalCode=" + postalCode + ", employeeCount=" + employeeCount + "]";
	}
}
