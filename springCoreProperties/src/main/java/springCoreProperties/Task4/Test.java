package springCoreProperties.Task4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(myappConfig.class);
		
		Student s = (Student) ac.getBean("students",Student.class);
		
		System.out.println(s);
		
		ac.close();
	}

}
