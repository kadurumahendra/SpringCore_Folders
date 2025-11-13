package SpringLookUpMethod.Task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(myappConfig.class);
		
		School s = (School) ac.getBean("schools");
		System.out.println(s);
		System.out.println(s.hashCode());
		
		School s1 = (School) ac.getBean("schools");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		Teacher t = (Teacher) ac.getBean("teachers",Teacher.class);
		System.out.println(t);
		System.out.println(t.hashCode());
		
		Teacher t1 = (Teacher) ac.getBean("teachers",Teacher.class);
		System.out.println(t1);
		System.out.println(t1.hashCode());
		
		Subject sub = (Subject) ac.getBean("subjects",Subject.class);
		System.out.println(sub);
		System.out.println(sub.hashCode());
		
		
		Subject sub1 = (Subject) ac.getBean("subjects",Subject.class);
		System.out.println(sub1);
		System.out.println(sub1.hashCode());
		
		
		
		
	
	}

}
