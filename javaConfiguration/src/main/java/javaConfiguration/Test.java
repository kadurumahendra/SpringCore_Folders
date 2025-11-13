package javaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Doctor doc =(Doctor) context.getBean(Doctor.class);
        System.out.println(doc);

        Hospital hos = (Hospital) context.getBean(Hospital.class);
        System.out.println(hos);

}
}
