package studentComponentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("teacher")
public class Teacher {
	
	@Value("Keerthi")
	private String teacherName;
	
	@Autowired
	private Student students;

	public Teacher() {
		super();
	}

	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + ", students=" + students + "]";
	}
	
	

}
