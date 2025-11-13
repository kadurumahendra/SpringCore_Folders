package constructorInjection.task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("studentConfig.xml");
		
		Student students = (Student) ac.getBean("student");
		
		System.out.println(students);
		
	}

}
