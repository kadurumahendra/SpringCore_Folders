package com.mobileAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mobile")
public class Mobile {
	
	@Value("samsung galaxy s21")
	private String model;
	
	@Autowired
	private Sim sim;

	public Mobile() {
		super();
	}

	@Override
	public String toString() {
		return "Mobile [model=" + model + ", sim=" + sim + "]";
	}
	
	
	

}
