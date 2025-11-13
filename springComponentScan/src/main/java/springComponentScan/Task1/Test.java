package springComponentScan.Task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("springComponentScan.Task1")
public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Test.class);
		
//		ac.refresh();
		
		
		
		Car c = ac.getBean("cars",Car.class);
		System.out.println(c);
		
		Engine e =  ac.getBean("engine",Engine.class);
		System.out.println(e);
		
		
		// either we will write in like up or down two are valid to get the output
		
		Car c1 = (Car) ac.getBean("cars",Car.class);
		System.out.println(c1);
		
		Engine e1 = (Engine) ac.getBean("engine",Engine.class);
		System.out.println(e1);
		
		ac.close();
		
		
		
	}

}
