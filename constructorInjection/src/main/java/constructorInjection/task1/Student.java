package constructorInjection.task1;

public class Student {
	
	private int id;
	
	private String name;
	
	private String coursecode;
	
	private int marks;
	
	private char grade;

	public Student(int id, String name, String coursecode, int marks, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.coursecode = coursecode;
		this.marks = marks;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", coursecode=" + coursecode + ", marks=" + marks + ", grade="
				+ grade + "]";
	}
	
	

}
