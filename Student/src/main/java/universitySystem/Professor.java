package universitySystem;

public class Professor {
	
	private int profId;
	private String profName;
	private double salary;
	private Department department;
	public Professor() {
		super();
	}
	public int getProfId() {
		return profId;
	}
	public void setProfId(int profId) {
		this.profId = profId;
	}
	public String getProfName() {
		return profName;
	}
	public void setProfName(String profName) {
		this.profName = profName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Professor [profId=" + profId + ", profName=" + profName + ", salary=" + salary + ", department="
				+ department + "]";
	}
	
	
	
	

}
