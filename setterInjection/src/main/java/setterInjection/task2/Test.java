package setterInjection.task2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("task2.xml");
		
		Author a = (Author) ac.getBean("authors");
		System.out.println(a);
		
		Book b = (Book) ac.getBean("books");
		System.out.println(b);
		
		Library l = (Library) ac.getBean("library");
		System.out.println(l);
	}
}
