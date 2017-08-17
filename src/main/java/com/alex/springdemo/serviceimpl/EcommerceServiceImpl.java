package com.alex.springdemo.serviceimpl;

import java.util.Random;

import com.alex.springdemo.service.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "Some crazy string 2 eCommerce " + companyName; 
		return service; 
	}

}
