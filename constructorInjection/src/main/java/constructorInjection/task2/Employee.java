package constructorInjection.task2;

public class Employee {
	
	private int empId;
	private String empName;
	private Department dept;
	
	
	public Employee(int empId, String empName, Department dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dept=" + dept + "]";
	}
	
	
	

}
