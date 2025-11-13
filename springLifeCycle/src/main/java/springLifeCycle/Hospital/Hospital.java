package springLifeCycle.Hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("hospitals")
public class Hospital {
	
	@Value("Mahendra Hospitals")
	private String hospitalName;
	
	@Value("Naidupeta")
	private String location;
	
	@Autowired
	private Doctor doctor;
	
	@PostConstruct
	public void initMethod()
	{
		System.out.println("Hospital setup completed for " + hospitalName + " at " + location);
		
	}
	
	@PreDestroy
	public void destroyMethod()
	{
		System.out.println("Hospital " +hospitalName + "is shutting down ");
		
	}

	public Hospital() {
		super();
	}

	@Override
	public String toString() {
		return "Hospital [hospitalName=" + hospitalName + ", location=" + location + ", doctor=" + doctor + "]";
	}
	
	
	
	

}
