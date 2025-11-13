package com.vehicleAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	@Value("male")
	private String type;
	
	@Value("200")
	private int horsepower;

	public Engine() {
		super();
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + ", horsepower=" + horsepower + "]";
	}

	
	
	
	
	
	

}
