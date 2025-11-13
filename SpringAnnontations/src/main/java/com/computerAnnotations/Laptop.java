package com.computerAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop {
	@Value("Dell Inspiron 15")
	private String model;
	
	@Autowired
	private Processor processor;

	public Laptop() {
		super();
	}

	@Override
	public String toString() {
		return "Laptop [model=" + model + ", processor=" + processor + "]";
	}
	
	
	
	

}
