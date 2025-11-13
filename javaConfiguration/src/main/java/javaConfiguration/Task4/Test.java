package javaConfiguration.Task4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(myappConfig.class);
		
		Professor p1 = (Professor) ac.getBean("professor",Professor.class);
		System.out.println(p1);
		System.out.println("============================================================");
		
		System.out.println("\n--- University 1 Details ---");
		University u = (University) ac.getBean("university",University.class);
		System.out.println(u);
		u.meth1(5);
		System.out.println("============================================================");
		
		System.out.println("\n--- University 2 Details ---");
		University u1 = (University) ac.getBean("university",University.class);
		System.out.println(u1);
		u.meth1(5);
		System.out.println("============================================================");

		Department d = (Department) ac.getBean("department",Department.class);
		System.out.println(d);
		System.out.println("============================================================");

		ac.close();
	}

}
