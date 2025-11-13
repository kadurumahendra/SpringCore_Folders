package com.mobileAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		
		ac.scan("com.mobileAnnotations");
		
		ac.refresh();
		
		Mobile m = ac.getBean("mobile",Mobile.class);
		
		System.out.println(m);
		
		ac.close();
	}

}
