package springComponentScan.Task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cars")
public class Car {
	
	@Value("TATA")
	private String modelName;
	
	@Value("2021")
	private String modelYear;
	
	@Autowired
	private Engine engine;

	public Car() {
		super();
	}

	@Override
	public String toString() {
		return "Car [modelName=" + modelName + ", modelYear=" + modelYear + ", engine=" + engine + "]";
	}
	
	
	

}
