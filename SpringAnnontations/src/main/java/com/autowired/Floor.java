package com.autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Floor {
	
	@Value("4")
	private int floorRooms;
	
	@Value("3")
	private int bathrooms;
	
	
	public Floor() {
		super();
	}
	
	
	
	@Override
	public String toString() {
		return "Floor [floorRooms=" + floorRooms + ", bathrooms=" + bathrooms + "]";
	}
	
	
	
	

}
