package springComponentScan.Task1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("engine")
public class Engine {
	
	@Value("diesel")
	private String engineType;
	
	@Value("200 CC")
	private String capacity;

	public Engine() {
		super();
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", capacity=" + capacity + "]";
	}
	
	

}
