package javaConfiguration.Task2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("javaConfiguration.Task2")
public class MyappConfig {

	@Bean(initMethod = "init", destroyMethod = "destroy")
//	@Bean
	public Professor prof() {
	    Professor p = new Professor();
	    p.setProfId(10);
	    p.setProfName("Radhika");
	    p.setGender("FEMALE");
	    return p;
	}
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	
	public Student student(Professor prof)
	{
		Student s = new Student();
		s.setRollNo(10);
		s.setName("mahendra");
		s.setMarks(99);
		s.setCourseCode("SPIC");
		s.setGrade('A');
		return s;
	}
}
