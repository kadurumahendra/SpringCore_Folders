package constructorInjection.task3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("task3.xml");
		
		College c = (College) ac.getBean("college");
		System.out.println(c);
		
		Professor p  = (Professor) ac.getBean("professor");
		System.out.println(p);
		
		Department d = (Department) ac.getBean("department");
		System.out.println(d);
	}

}
