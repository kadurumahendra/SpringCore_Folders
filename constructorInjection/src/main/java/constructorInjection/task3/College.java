package constructorInjection.task3;

public class College {
	
	private String collegeName;
	private Department department;
	public College(String collegeName, Department department) {
		super();
		this.collegeName = collegeName;
		this.department = department;
	}
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", department=" + department + "]";
	}
	
	
	

}
