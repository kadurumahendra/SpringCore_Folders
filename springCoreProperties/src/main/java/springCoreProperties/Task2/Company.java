package springCoreProperties.Task2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Company {
	
	@Value("${company.compName}")
	private String compName;
	
	@Value("${company.estYear}")
	private int estYear;
	
	
	

	@PostConstruct
	
	public void init()
	{
		System.out.println("init method excueted");
	}
	
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy method closed");
	}


	public Company() {
		super();
	}


	@Override
	public String toString() {
		return "Company [compName=" + compName + ", estYear=" + estYear + "]";
	}
	
	
	

}
