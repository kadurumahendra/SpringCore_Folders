package course;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");

        Course c = (Course) ac.getBean("course");
        System.out.println(c);

        Student s = (Student) ac.getBean("student");
        System.out.println(s);
    }
}
