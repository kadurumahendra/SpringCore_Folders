package com.computerAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("proc")
public class Processor {
	
	@Value("intel i7")
	private String brand;
	
	@Value("8")
	private int cores;

	public Processor() {
		super();
	}

	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", cores=" + cores + "]";
	}
	
	
	

}
