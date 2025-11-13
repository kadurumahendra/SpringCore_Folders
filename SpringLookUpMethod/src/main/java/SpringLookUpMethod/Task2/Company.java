package SpringLookUpMethod.Task2;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("company")
@Scope("singleton")
public class Company {

    @Value("${company.companyName}")
    private String companyName;

    @Value("${company.location}")
    private String location;

    public Company() {
        System.out.println("Company bean created...");
    }

    @Lookup
    public Department getNewDepartment() {
        return null;
    }

    public void showDetails() {
        Department d1 = getNewDepartment();
        Department d2 = getNewDepartment();

        System.out.println("Company: " + companyName + ", Location: " + location);
        System.out.println("Department 1: " + d1);
        System.out.println("Department 2: " + d2);
        System.out.println("Department hashcodes: " + d1.hashCode() + " & " + d2.hashCode());
    }
}
