package javaConfiguration.Task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyappConfig.class);
		
		Student s1 = (Student) ac.getBean("student",Student.class);
		
		System.out.println(s1);
		s1.meth1();
		s1.meth2();
		
		Professor p1 = (Professor) ac.getBean("prof",Professor.class);
		System.out.println(p1);
		
		ac.close();
	}

}

