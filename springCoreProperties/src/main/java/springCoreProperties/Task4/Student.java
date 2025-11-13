package springCoreProperties.Task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("students")
public class Student {
	
	@Value("${student.name}")
	private String name;
	
	@Value("${student.rollNo}")
	private int rollNo;
	
	@Value("${student.grade}")
	private String grade;
	
	@Autowired
	private Teacher teacher;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", grade=" + grade + ", teacher=" + teacher + "]";
	}
	
	

}
