package com.aldarden.spring.springcore.lc.project;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TicketReservation {
	
	@PostConstruct
	private void initialize(){
		System.out.println("Inside the init method");
	}
	
	@PreDestroy
	private void cleanUp(){
		System.out.println("Inside the clean method");
	}
	
	
	
	
	
}
