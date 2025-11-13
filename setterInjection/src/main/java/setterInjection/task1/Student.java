package setterInjection.task1;

public class Student {
	
	private String studentName;
	
	private Course course;

	public Student() {
		super();
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", course=" + course + "]";
	}
	
	
	

}
