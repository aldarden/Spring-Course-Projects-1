package com.aldarden.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/aldarden/spring/springcore/properties/propconfig.xml");
		CountriesAndLanguages countriesAndLangs = (CountriesAndLanguages) context
				.getBean("countriesAndLangs");
		System.out.println(countriesAndLangs);

	}

}
