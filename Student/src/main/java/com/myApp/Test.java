package com.myApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("studentConfiguration.xml");
		Student stuCon = (Student)
				ac.getBean("stuCon");
		System.out.println(stuCon);
	}

}
