package com.hospitalAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("doctor")
public class Doctor {
	
	@Value("Keerthi")
	private String doctorName;
	
	@Value("Kidney Specialist")
	private String specialization;
	
	@Autowired
	private Hospital hospital;

	public Doctor() {
		super();
	}

	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", specialization=" + specialization + "]";
	}
	
	
	

}
