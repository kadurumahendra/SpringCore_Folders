package com.combinePackages;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.mobileAnnotations.Mobile;

@Component("teach")
public class Teacher {
	
	@Value("Radhika")
	private String name;
	
	@Value("SPIC7")
	private String coursecode;
	
	@Autowired
	private Mobile mobile;

	public Teacher() {
		super();
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", coursecode=" + coursecode + ", mobile=" + mobile + "]";
	}
	
	
	

}
