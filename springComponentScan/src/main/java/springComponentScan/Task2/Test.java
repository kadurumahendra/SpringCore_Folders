package springComponentScan.Task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"springComponentScan.Task2", "springComponentScan.Task1"})
public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Test.class);

        Department department = ac.getBean(Department.class);
        System.out.println(department);

        Employee employee = ac.getBean(Employee.class);
        System.out.println(employee);

        ac.close();
    }
}
