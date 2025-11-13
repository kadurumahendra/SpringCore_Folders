package springCoreProperties.Task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Engine {
	
	@Value("${engine.type}")
	private String type;
	
	@Autowired
	private Company company;
	
	
	
	

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


	public Engine() {
		super();
	}


	@Override
	public String toString() {
		return "Engine [type=" + type + ", company=" + company + "]";
	}
	
	
	

}
