package springLifeCycle.libraryManagement;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("springLifeCycle.libraryManagement")
public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Test.class);
		
		Book b = (Book) ac.getBean("books");
		
		System.out.println(b);
		
		System.out.println("____________________________________________________");
		
		Library l = (Library) ac.getBean("library");
		
		System.out.println(l);
		
		ac.close();
	}

}
