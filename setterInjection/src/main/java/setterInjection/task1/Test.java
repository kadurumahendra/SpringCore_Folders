package setterInjection.task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("task1.xml");
		
		Student s = (Student) ac.getBean("student");
		System.out.println(s);
		
		Course c  = (Course) ac.getBean("courses");
		System.out.println(c);
	}

}
