package com.aldarden.spring.springcore.lc.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/aldarden/spring/springcore/lc/annotations/lcconfig.xml");
		// We use the student bean here as this is the final result we want
		// Yes, we have the scores bean, but it is just a property of the
		// Student bean
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		
		// Invokes destroy methods
		context.registerShutdownHook();
		
		
		
	}

}
