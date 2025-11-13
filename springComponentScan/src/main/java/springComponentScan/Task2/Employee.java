package springComponentScan.Task2;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import springComponentScan.Task1.Car;

@Component("employees")
public class Employee {

    @Value("Mahendra")
    private String empName;

    @Autowired
    private Car car;

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee [empName=" + empName + ", car=" + car + "]";
    }
}
