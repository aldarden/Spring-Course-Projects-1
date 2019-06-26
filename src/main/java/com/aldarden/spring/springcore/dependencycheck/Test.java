package com.aldarden.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/aldarden/spring/springcore/dependencycheck/dcconfig.xml");
		
		Prescription prescription = (Prescription) context
				.getBean("prescription");
		System.out.println(prescription);

		

	}

}
