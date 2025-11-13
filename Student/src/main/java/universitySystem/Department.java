package universitySystem;

public class Department {
	
	private String deptName;
	private String hod;
	private University university;
	public Department() {
		super();
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getHod() {
		return hod;
	}
	public void setHod(String hod) {
		this.hod = hod;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	
	
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", hod=" + hod + ", university=" + university + "]";
	}

	
	
}
