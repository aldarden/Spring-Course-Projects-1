package com.aldarden.spring.springcore.a6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/aldarden/spring/springcore/a6/dcconfig.xml");
		
		University university = (University) context
				.getBean("university");
		System.out.println(university);

		University university1 = (University) context
				.getBean("university");
		System.out.println(university1);

		
		
	}

}
