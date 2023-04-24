package com.masai.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.masai.model.ArtistManagement;

@Service("eventOrganizerImpl")
@Lazy(value = true)
public class EventOrganizerImpl implements EventOrganizer{

	@Autowired(required = false)
	@Qualifier("singer")
	private ArtistManagement artistManagement;

    @Override	
	public void findArtist(String message) {
		// TODO Auto-generated method stub
    	artistManagement.announceAvailability(message);
    	
    }

	public ArtistManagement getArtistManagement() {
		return artistManagement;
	}

	public void setArtistManagement(ArtistManagement artistManagement) {
		this.artistManagement = artistManagement;
	}

//    public ArtistManagement getArtistManagement() {
//    	return artistManagement;
//    }
    
	public void displaydetails() {
		System.out.println("Event date is " + LocalDate.now());
		System.out.println("Event vanue is : Live Singing Show");
	}
    
	public void ending () {
		System.out.println("Thank you for attending the event");
	}

//	@Override
//	public void findArtist(String message) {
//		// TODO Auto-generated method stub
//		
//	}
	
}
