package springLifeCycle.Hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("doctors")
public class Doctor {
	
	@Value("10")
	private int doctorId;
	
	@Value("Dr Mahendra")
	private String doctorName;
	
	@Value("cancer specialist")
	private String specialization;
	
	@Autowired
	private Patients patients;
	
	@PostConstruct
	
	public void initMethod()
	{
		System.out.println("Doctor " + doctorName + " is now avalible for patients");
	}
	
	@PreDestroy
	
	public void destroy()
	{
		System.out.println("Doctor " + doctorName + " has left the hospital");
	}

	public Doctor() {
		super();
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialization=" + specialization
				+ ", patients=" + patients + "]";
	}

	
}
