package com.combinePackages;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		
		ac.scan("com.combinePackages","com.mobileAnnotations");
		
		ac.refresh();
		
		Teacher t =  ac.getBean("teach",Teacher.class);
		System.out.println(t);
		ac.close();
		
	}

}
