package shoppingAnnontations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.scan("shoppingAnnontations");
		
		 ac.refresh();
		
		 ann an = ac.getBean("aob", ann.class);
	        System.out.println(an);
	        
	        // Close the context (good practice)
	        ac.close();
	}

}
