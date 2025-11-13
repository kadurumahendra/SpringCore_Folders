package javaConfiguration;

public class Hospital {
	
	private String hospitalName;
    private String location;
    private Doctor doctor;

    public Hospital() { }

    public Hospital(String hospitalName, String location, Doctor doctor) {
        this.hospitalName = hospitalName;
        this.location = location;
        this.doctor = doctor;
    }

    // getters/setters
    public String getHospitalName() { return hospitalName; }
    public void setHospitalName(String hospitalName) { this.hospitalName = hospitalName; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public Doctor getDoctor() { return doctor; }
    public void setDoctor(Doctor doctor) { this.doctor = doctor; }

    public void init() {
        System.out.println("Hospital setup completed for " + hospitalName + " at " + location);
    }

    public void destroy() {
        System.out.println("Hospital " + hospitalName + " is shutting down");
    }

    @Override
    public String toString() {
        return "Hospital [hospitalName=" + hospitalName + ", location=" + location + ", doctor=" + doctor + "]";
    }

}
