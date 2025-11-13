package studentComponentScan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("students")
public class Student {
	
	@Value("10")
	private int id;
	
	@Value("Mahendra")
	private String studentName;
	
	@Value("SPIC7")
	private String couresName;

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", couresName=" + couresName + "]";
	}
	
	
	
	

}
