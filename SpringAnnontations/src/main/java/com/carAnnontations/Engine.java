package com.carAnnontations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("engines")
public class Engine {
	@Value("2nd type")
	private String engineType;
	
	@Value("200 cc")
	private String horsePower;

	public Engine() {
		super();
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", horsePower=" + horsePower + "]";
	}
	
	
	

}
