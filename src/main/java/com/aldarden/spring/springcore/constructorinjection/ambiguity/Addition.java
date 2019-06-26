package com.aldarden.spring.springcore.constructorinjection.ambiguity;

public class Addition {

	
	Addition(int a, double b){
		System.out.println("Inside the Constructor");
		System.out.println(a);
		System.out.println(b);
	}
	
	
	// If ambiguity problem occurs between double and int constructors, it uses the first one found (can fix this with attributes in
	// the constructor arg
	Addition(double a, double b){
		System.out.println("Inside constructor DOUBLE");
	}

	
	
	Addition(int a, int b){
		System.out.println("Inside constructor INT");
	}
	
	
	// Spring container tries to find constructor that use String parameter types which is why this constructor is used
	Addition(String a, String b){
		System.out.println("Inside constructor String");
	}
	

}
