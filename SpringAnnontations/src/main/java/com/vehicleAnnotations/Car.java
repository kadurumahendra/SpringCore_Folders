package com.vehicleAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Value("tata")
	private String brand;
	
	@Autowired
	private Engine engine;

	public Car() {
		super();
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", engine=" + engine + "]";
	}
	
	
	

}
