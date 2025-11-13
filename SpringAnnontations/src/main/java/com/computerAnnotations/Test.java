package com.computerAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		
		ac.scan("com.computerAnnotations");
		
		ac.refresh();
		
		Laptop laptop = ac.getBean("lap",Laptop.class);
		System.out.println("laptop is : "+laptop);
		
		ac.close();
	}

}
