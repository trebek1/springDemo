package com.alex.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp1 {

	public static void main(String[] args) {
		// create application context (container) 
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml"); 
		
		// create the bean 
		Organization org = (Organization) ctx.getBean("myorg"); 
		
		// invoke compay slogan by bean
		org.corporateSlogan(); 
		
		((FileSystemXmlApplicationContext)ctx).close(); 
		
	}

}
