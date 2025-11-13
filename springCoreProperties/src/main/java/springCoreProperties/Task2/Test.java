package springCoreProperties.Task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springCoreProperties.Task1.myappconfig;

public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(myappConfig.class);
		
		Car c = (Car) ac.getBean("cars",Car.class);
		System.out.println(c);
		
		Car c1 = (Car) ac.getBean("cars", Car.class);
		System.out.println(c1);
		
		Engine e = (Engine) ac.getBean(Engine.class);
		System.out.println(e);
		
		ac.close();
	}

}
