package constructorInjection.task3;

public class Department {
	private String deptName;
	private Professor professors;
	
	public Department(String deptName, Professor professors) {
		super();
		this.deptName = deptName;
		this.professors = professors;
	}

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", professor=" + professors + "]";
	}
	
	
	

}
