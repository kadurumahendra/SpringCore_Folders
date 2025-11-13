package constructorInjection.task2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("task2Config.xml");
		
		Employee e = (Employee) ac.getBean("employees");
		System.out.println(e);
		
		
		Department d = (Department) ac.getBean("departments");
		System.out.println(d);
	}

}
