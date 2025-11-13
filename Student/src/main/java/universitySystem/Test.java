package universitySystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("universityConfig.xml");
		
		University u = (University) ac.getBean("universities");
		System.out.println(u);
		
		Department d = (Department) ac.getBean("department");
		System.out.println(d);
		
		Professor p = (Professor) ac.getBean("professor");
		System.out.println(p);
	}

}
