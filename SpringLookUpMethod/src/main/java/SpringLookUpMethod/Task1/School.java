package SpringLookUpMethod.Task1;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("schools")
@Scope("singleton")
public class School {

    @Value("${school.schoolName}")
    private String schoolName;

    @Value("${school.address}")
    private String address;

    public School() {
        System.out.println("School object created...");
    }

    // This method will be overridden by Spring at runtime
    @Lookup
    public Teacher getnewTeacher() {
        return null;
    }

    @Override
    public String toString() {
        // Get a new Teacher every time to demonstrate lookup
        Teacher teacher = getnewTeacher();
        return "School [schoolName=" + schoolName + ", address=" + address + ", teacher=" + teacher + "]";
    }
}
