package SpringLookUpMethod.Task2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("employee")
@Scope("prototype")
public class Employee {

    @Value("${employee.empName}")
    private String empName;

    @Value("${employee.designation}")
    private String designation;

    public Employee() {
        System.out.println("Employee bean created...");
    }

    @Override
    public String toString() {
        return "Employee [empName=" + empName + ", designation=" + designation + "]";
    }
}
