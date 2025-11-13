package springComponentScan.Task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("departments")
public class Department {

    @Value("CSE")
    private String departmentName;

    @Autowired
    private Employee employee;

    public Department() {
        super();
    }

    @Override
    public String toString() {
        return "Department [departmentName=" + departmentName + ", employee=" + employee + "]";
    }
}
