package com.aldarden.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/aldarden/spring/springcore/set/setconfig.xml");
		CarDealer dealer = (CarDealer) context.getBean("cardealer");
		System.out.println(dealer.getName());
		System.out.println(dealer.getModels());

	}

}
