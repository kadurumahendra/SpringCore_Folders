package books;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		
		Book b = (Book) ac.getBean("book");
		System.out.println(b);
		
		Library l = (Library) ac.getBean("library");
		System.out.println(l);
	}
}
