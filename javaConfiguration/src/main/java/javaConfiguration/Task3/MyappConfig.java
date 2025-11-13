package javaConfiguration.Task3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("javaConfiguration.Task3")
public class MyappConfig {

    @Bean
    public Department dept() {
        Department d = new Department();
        d.setDept("Cyber Security");
        d.setSeminars(32);
        return d;
    }

    @Bean
    public Company company(Department dept) {
        Company c = new Company();
        c.setRegId(10);
        c.setName("Mahendra IT");
        c.setYear(1995);
        c.setDept(dept);
        return c;
    }
}
