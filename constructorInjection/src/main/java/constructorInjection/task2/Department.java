package constructorInjection.task2;

public class Department {
	
	private String deptName;
	private String location;
	
	
	public Department(String deptName, String location) {
		super();
		this.deptName = deptName;
		this.location = location;
	}


	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", location=" + location + "]";
	}
	
	
	
	

}
