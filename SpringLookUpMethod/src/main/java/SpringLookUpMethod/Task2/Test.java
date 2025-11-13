package SpringLookUpMethod.Task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(myappConfig.class);

        Company company = ac.getBean("company", Company.class);
        company.showDetails();

        System.out.println("Company hashCode: " + company.hashCode());
    }
}
