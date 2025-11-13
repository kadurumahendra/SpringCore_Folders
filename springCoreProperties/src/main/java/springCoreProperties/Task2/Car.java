package springCoreProperties.Task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("cars")
public class Car {
	
	
	 @Value("${car.modelName}")
	private String modelname;
	
	 @Value("${car.year}")
	private int year;
	
	@Autowired
	 private Engine engine;
	
	
	
	
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


	public Car() {
		super();
	}


	@Override
	public String toString() {
		return "Car [modelname=" + modelname + ", year=" + year + ", engine=" + engine + "]";
	}
	
	
	
	

}
