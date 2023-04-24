package com.masai.model;

import org.springframework.stereotype.Component;

@Component
public class Singer implements ArtistManagement{

	public void announceAvailability(String message) {
		// TODO Auto-generated method stub
		System.out.println(message + " Available for booking now!");
	}

	
}
