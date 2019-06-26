package com.aldarden.spring.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/aldarden/spring/springcore/reftypes/refconfig.xml");
		// We use the student bean here as this is the final result we want
		// Yes, we have the scores bean, but it is just a property of the
		// Student bean
		Student student = (Student) context.getBean("student");
		System.out.println(student);

	}

}
