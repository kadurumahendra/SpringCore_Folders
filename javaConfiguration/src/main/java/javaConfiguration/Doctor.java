package javaConfiguration;

public class Doctor {
	
	private int doctorId;
    private String doctorName;
    private String specialization;

    public Doctor() { }

    public Doctor(int doctorId, String doctorName, String specialization) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    // getters/setters
    public int getDoctorId() { return doctorId; }
    public void setDoctorId(int doctorId) { this.doctorId = doctorId; }
    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }
    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public void init() {
        System.out.println("Doctor " + doctorName + " is now available for patients");
    }

    public void destroy() {
        System.out.println("Doctor " + doctorName + " has left the hospital");
    }

    @Override
    public String toString() {
        return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialization=" + specialization + "]";
    }

}
