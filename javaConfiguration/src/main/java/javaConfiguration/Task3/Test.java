package javaConfiguration.Task3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyappConfig.class);
		
		Company c = (Company) ac.getBean("company",Company.class);
		System.out.println(c);
		c.meth1();
		
		Department d = (Department) ac.getBean("dept", Department.class);
		System.out.println(d);
		d.meth1();
		
		ac.close();
	}

}
