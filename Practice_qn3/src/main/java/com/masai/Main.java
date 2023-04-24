package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MySpringConfig.class);
		LibraryService ls = ctx.getBean(LibraryService.class);
		
		ls.printBookMap();
		
		System.out.println("Method 1 ends");
	
		ls.printLibrarianList();
		
		
		
		ls.printMemberList();
		
		
		
		ls.issueBook(1, 1, 1);
		
		
		ls.returnBook(1, 1, 1);
		
	}
	
}
