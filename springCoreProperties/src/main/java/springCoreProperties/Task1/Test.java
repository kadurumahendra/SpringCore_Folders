package springCoreProperties.Task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(myappconfig.class);

        University u = ac.getBean("univ", University.class);
        System.out.println(u);

        ac.close();
    }
}
