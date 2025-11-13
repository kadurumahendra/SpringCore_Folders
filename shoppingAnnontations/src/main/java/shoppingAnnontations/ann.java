package shoppingAnnontations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("aob")
public class ann {
	
	@Value("db")
	private String host;
	@Value("8008")
	private Integer port;
	
	
	public ann() {
		super();
	}


	@Override
	public String toString() {
		return "ann [host=" + host + ", port=" + port + "]";
	}
	
	
	
	

}
