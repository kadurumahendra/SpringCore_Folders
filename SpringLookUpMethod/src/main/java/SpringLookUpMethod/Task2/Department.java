package SpringLookUpMethod.Task2;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("department")
@Scope("prototype")
public class Department {

    @Value("${department.deptName}")
    private String deptName;

    @Value("${department.manager}")
    private String manager;

    public Department() {
        System.out.println("Department bean created...");
    }

    @Lookup
    public Employee getNewEmployee() {
        return null;
    }

    @Override
    public String toString() {
        Employee emp = getNewEmployee();
        return "Department [deptName=" + deptName + ", manager=" + manager + ", employee=" + emp + "]";
    }
}
