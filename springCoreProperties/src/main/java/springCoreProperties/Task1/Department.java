package springCoreProperties.Task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {

    @Value("${department.name}")
    private String department;

    @Value("${department.professors}")
    private int professors;

    @Autowired
    private Professor professor;

    @Override
    public String toString() {
        return "Department [department=" + department + ", professors=" + professors + ", professor=" + professor + "]";
    }
}
