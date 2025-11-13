package springCoreProperties.Task3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(myappConfig.class);
		
		Hotel h = (Hotel) ac.getBean("hotels",Hotel.class);
		System.out.println(h);
		ac.close();
	}
	
	

}
