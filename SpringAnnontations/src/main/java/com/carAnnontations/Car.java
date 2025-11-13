package com.carAnnontations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.hospitalAnnotations.Doctor;

@Component("car")
public class Car {
	
	@Value("tata")
	private String brand;
	
	@Value("2024")
	private int model;
	
	@Autowired
	private Engine engine;
	
	@Autowired
	private Doctor doctor;

	public Car() {
		super();
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", engine=" + engine + ", doctor=" + doctor + "]";
	}

	
	
	

}
