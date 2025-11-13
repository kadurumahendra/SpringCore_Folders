package springLifeCycle.Hospital;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration("patient")
public class Patients {
	
	@Value("Vasavika")
	private String patientName;
	
	
	

}
