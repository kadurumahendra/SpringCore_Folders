package javaConfiguration.Task4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("javaConfiguration.Task4")
public class myappConfig {

    @Bean
    public Professor professor() {
        Professor p = new Professor();
        p.setProfName("Mahendra");
        p.setSubject("AI & ML");
        return p;
    }

    @Bean
    public Department department(Professor professor) {
        Department d = new Department();
        d.setDepartment("Computer Science");
        d.setProfessors(12);
        d.setProfessor(professor);
        return d;
    }

    @Bean
    public University university(Department dept) {
        University u = new University();
        u.setUnivName("SmartTech University");
        u.setYear(2001);
        u.setDept(dept);
        u.meth1(5);
        return u;
    }
       
    
    // it is duplicate bean 
        @Bean
        public University university1(Department dept) {
            University u1 = new University();
            u1.setUnivName("SmartTech College");
            u1.setYear(2020);
            u1.setDept(dept);
            u1.meth1(4);
            return u1;
        
    }
        
//        @Bean
//        public Department department1(Professor professor) {
//            Department d1 = new Department();
//            d1.setDepartment("ECE");
//            d1.setProfessors(12);
//            d1.setProfessor(professor);
//            return d1;
//        }
//    
    
}