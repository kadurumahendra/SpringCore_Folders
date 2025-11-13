package com.vehicleAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		
		ac.scan("com.vehicleAnnotations");
		
		ac.refresh();
		
		Car c = ac.getBean("car",Car.class);
		System.out.println(c);
		
		ac.close();
	}

}
