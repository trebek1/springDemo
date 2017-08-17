package com.alex.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alex.springdemo.domain.Organization;

public class DISetterApp {

	public static void main(String[] args) {
		// create application context (container) 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml"); 
		
		// create the bean 
		Organization org = (Organization) ctx.getBean("myorg"); 
		
		// invoke compay slogan by bean
		System.out.println(org.corporateSlogan()); 
		
		// print org details 
		System.out.println(org);
		
		System.out.println(org.corporateService());
		
		((ClassPathXmlApplicationContext)ctx).close(); 
		
	}

}
