package studentComponentScan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("studentComponentScan")
public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Test.class);
		
		Teacher t = ac.getBean("teacher", Teacher.class);
		
		System.out.println(t);
		
		Student s = ac.getBean("students",Student.class);
		
		System.out.println(s);
		
		ac.close();
	}
}
