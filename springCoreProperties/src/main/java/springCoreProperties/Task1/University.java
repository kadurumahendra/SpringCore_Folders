package springCoreProperties.Task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("univ")
public class University {
    
    @Value("${university.name}")
    private String univName;

    @Value("${university.year}")
    private int year;

    @Autowired
    private Department dept;

    @Override
    public String toString() {
        return "University [univName=" + univName + ", year=" + year + ", dept=" + dept + "]";
    }
}
