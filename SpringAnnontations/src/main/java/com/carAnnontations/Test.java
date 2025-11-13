package com.carAnnontations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		
		ac.scan("com.carAnnontations","com.hospitalAnnotations");
		
		ac.refresh();
		
		Car c = ac.getBean("car", Car.class);
		System.out.println("car and engine is : "+ c);
		
		Engine e = ac.getBean("engines",Engine.class);
		System.out.println("engines are :"+e);
		
		
	}

}
