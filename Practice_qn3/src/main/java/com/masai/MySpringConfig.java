package com.masai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.masai"})
public class MySpringConfig {                                         

	@Bean
	public Map<Librarian, List<Book>> bookMap(){
		
		Librarian lib1 = new Librarian(1,"Samad",20,4,"Sd@gmail.com",1234567890);
		Librarian lib2 = new Librarian(2,"Shahid",22,2,"Sh@gmail.com",1234566543);
		Librarian lib3 = new Librarian(3,"Fehmida",28,3,"fehm@gmail.com",1234568765);
		
		Book book1 = new Book(1,"Atomic Habits","James clear","2001",true);
		Book book2 = new Book(2,"Rich dad Poor dad"," Robert T. Kiyosaki and Sharon Lechter.","1997",true);
		Book book3 = new Book(3,"RD Sharma "," Ravi Dutt Sharma ","1992",false);
		Book book4 = new Book(4,"HC Verma"," R. S. Aggarwal","1995",false);
		Book book5 = new Book(5,"Psycology of Money","Morgan Housel","1994",true);
		
		List<Book> booklist1 = new ArrayList<Book>();
		booklist1.add(book1);
		booklist1.add(book2);
		booklist1.add(book3);
		booklist1.add(book4);
		List<Book> booklist2 = new ArrayList<Book>();
		booklist2.add(book2);
		booklist2.add(book5);
		List<Book> booklist3 = new ArrayList<Book>();
		booklist2.add(book2);
		booklist2.add(book1);
		booklist2.add(book5);
		
		Map<Librarian , List<Book>> LibrarianListMap = new HashMap<>();
		LibrarianListMap.put(lib1, booklist1);
		LibrarianListMap.put(lib2, booklist2);
		LibrarianListMap.put(lib3, booklist3);

		return LibrarianListMap;
	}
	@Bean
	public List<Librarian> LibrarianList(){
		
		Librarian Librarian1 = new Librarian(1,"Shahid",20,4,"Sh@gmail.com",1234567890);
		Librarian Librarian2 = new Librarian(2,"Samad",22,2,"Sd@gmail.com",1234566543);
		Librarian Librarian3 = new Librarian(3,"Qamar",28,3,"Qm@gmail.com",1234568765);
		Librarian Librarian4 = new Librarian(4,"Kadir",23,4,"Kdr@gmail.com",1234777543);
		Librarian Librarian5 = new Librarian(5,"Afridi",26,3,"Afd@gmail.com",1234747765);
		
		return Arrays.asList(Librarian1,Librarian2,Librarian3,Librarian4,Librarian5);

	}
	@Bean
	public List<Member> MemberList(){
		
		Member member1 = new Member(1,"Mickle",20,2,"mc@gmail.com",12345678);
		Member member2 = new Member(2,"David",22,3,"dv@gmail.com",12345677);
		Member member3 = new Member(3,"Ronald",24,4,"jc@gmail.com",12345676);
		Member member4 = new Member(4,"Anglo",22,1,"ak@gmail.com",12345675);
		Member member5 = new Member(5,"Donald",26,0,"dn@gmail.com",12345674);
		Member member6 = new Member(6,"John",23,2,"jn@gmail.com",12345673);
		Member member7 = new Member(7,"Stonish",21,1,"st@gmail.com",12345672);
		
		return Arrays.asList(member1,member2,member3,member4,member5,member6,member7);
	}
		
}
