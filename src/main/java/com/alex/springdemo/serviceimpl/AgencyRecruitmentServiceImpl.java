package com.alex.springdemo.serviceimpl;

import java.util.Random;

import com.alex.springdemo.service.RecruitmentService;

public class AgencyRecruitmentServiceImpl implements RecruitmentService {

	public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitments) {
		Random random = new Random();
		String hiringFacts = "\n " + companyName + " s " + departmentName + " hired + " + random.nextInt(numberOfRecruitments) + " employees .";	
		return hiringFacts; 
	}
}
