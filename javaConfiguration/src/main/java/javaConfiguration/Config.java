package javaConfiguration;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("javaConfiguration")
public class Config {
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public Doctor doctor()
	{
		return new Doctor(101, "Mahendra","Cardiologist");
		
	}
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public Hospital hospital(Doctor doctor)
	{
		Hospital h = new Hospital();
		 h.setHospitalName("Saveetha Hospital");
	        h.setLocation("Chennai");
	        h.setDoctor(doctor);
	        return h;
	}
	
	
	

}
