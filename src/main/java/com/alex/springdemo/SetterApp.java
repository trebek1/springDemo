package com.alex.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterApp {

	public static void main(String[] args) {
		// create application context (container) 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml"); 
		
		// create the bean 
		Organization org = (Organization) ctx.getBean("myorg"); 
		
		// invoke compay slogan by bean
		org.corporateSlogan(); 
		
		// print org details 
		System.out.println(org);
		
		((ClassPathXmlApplicationContext)ctx).close(); 
		
	}

}
