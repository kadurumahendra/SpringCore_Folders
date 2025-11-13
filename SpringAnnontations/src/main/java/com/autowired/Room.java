package com.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("rooms")
public class Room {
	@Value("3")
	private int roomMembers;
	
	@Value("2")
	private int switches;
	
	@Value("4")
	private int hangers;
	@Value("2")
	private int  bulbs;
	
	@Autowired(required = false)
	private Floor floor;

	public Room() {
		super();
	}

	@Override
	public String toString() {
		return "Room [roomMembers=" + roomMembers + ", switches=" + switches + ", hangers=" + hangers + ", bulbs="
				+ bulbs + ", floor=" + floor + "]";
	} 
	

}
