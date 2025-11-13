package com.hospitalAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		
		ac.scan("com.hospitalAnnotations");
		
		ac.refresh();
		
		Doctor d = ac.getBean("doctor",Doctor.class);
		
		System.out.println(d);
		
		Hospital h = ac.getBean("hospitals",Hospital.class);
		System.out.println(h);
		
		ac.close();
	}

}
