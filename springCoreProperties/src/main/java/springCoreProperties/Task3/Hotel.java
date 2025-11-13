package springCoreProperties.Task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("hotels")
public class Hotel {
	
	@Value("${hotel.name}")
	private String name;
	
	@Value("${hotel.location}")
	private String location;
	
	@Value("${hotel.ratings}")
	private double ratings;
	
	@Autowired
	private Manager manager;
	
	@PostConstruct
	public void init()
	{
		System.out.println("init method for Hotel");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy method for Hotel");
	}

	public Hotel() {
		
		super();
		System.out.println("this is constructor loading");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", location=" + location + ", ratings=" + ratings + ", manager=" + manager + "]";
	}
	
	
	
	
	
	

}
