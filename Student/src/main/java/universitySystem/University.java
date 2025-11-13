package universitySystem;

public class University {

	private String univName;
	private String location;
	
	
	public University() {
		super();
	}


	public String getUnivName() {
		return univName;
	}


	public void setUnivName(String univName) {
		this.univName = univName;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "University [univName=" + univName + ", location=" + location + "]";
	}
	
	
}
