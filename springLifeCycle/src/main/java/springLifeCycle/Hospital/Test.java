package springLifeCycle.Hospital;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		
		Hospital h = (Hospital) ac.getBean("hospitals");
		
		System.out.println(h);
		
		ac.close();
	}

}
