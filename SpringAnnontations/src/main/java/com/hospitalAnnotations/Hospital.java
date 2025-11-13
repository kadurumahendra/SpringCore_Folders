package com.hospitalAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hospitals")
public class Hospital {
	
	@Value("Mahendra Hospital")
	private String hospitalName;
	
	@Value("Naidupeta")
	private String location;
	public Hospital() {
		super();
	}
	@Override
	public String toString() {
		return "Hospital [hospitalName=" + hospitalName + ", location=" + location + "]";
	}
	
	
	
	

}
