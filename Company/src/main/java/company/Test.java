package company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		
		
		Car c = (Car) ac.getBean("car");
		System.out.println(c);
		
		Engine e = (Engine) ac.getBean("engines");
		System.out.println(e);
	}

}
