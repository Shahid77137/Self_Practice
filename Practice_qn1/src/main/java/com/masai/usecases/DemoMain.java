package com.masai.usecases;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.services.EventOrganizer;
import com.masai.services.EventOrganizerImpl;
import com.masai.util.AppConfig;

public class DemoMain {
	
	public static void main(String[] args) {
		ApplicationContext apc = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EventOrganizer eo = apc.getBean(EventOrganizerImpl.class);
		eo.findArtist("Singer");
		EventOrganizerImpl em = apc.getBean(EventOrganizerImpl.class);
		em.displaydetails();
		
		((AnnotationConfigApplicationContext)apc).close();
		
	}
}



