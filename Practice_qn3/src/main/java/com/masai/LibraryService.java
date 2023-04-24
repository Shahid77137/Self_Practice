package com.masai;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class LibraryService {

	// Hint: Use setter injection to inject bookMap, librarianList, and memberList
	
    @Autowired
    private Map<Librarian, List<Book>> bookMap; // inject 3 entries with valid details
    @Autowired
    private List<Librarian> librarianList; // inject a list of 5 Librarian objects
    @Autowired
    private List<Member> memberList; // inject a list of 7 Member objects

    public void printBookMap() {
        // print all the librarians and their associated book details from the bookMap
    	
    	for(Map.Entry<Librarian, List<Book>> entry : bookMap.entrySet()) {
    		System.out.println(entry.getKey());
    		List<Book> bookList = entry.getValue();
    		for(Book book : bookList) {
    			System.out.println(book);
    		}
    		System.out.println();
    		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    		System.out.println();
    	}
    	
    }

    public void printLibrarianList() {
        // sort the list of librarians according to the decreasing order of the noOfBooksIssued
        // if noOfBooksIssued are the same, then sort by age
        // print all the sorted Librarian details
    	
    	librarianList.sort((a,b) -> {
    		if(a.getNoOfBooksIssued() == b.getNoOfBooksIssued()) {
    			return a.getAge() - b.getAge();
    		}else {
    			return b.getNoOfBooksIssued() - a.getNoOfBooksIssued();
    		}
    	});
    	
    	for(Librarian librarian: librarianList) {
    		System.out.println(librarian);
    		System.out.println();
    		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    		System.out.println();
    	}
    	
    }

    public void printMemberList() {
        // sort the list of members according to the decreasing order of the noOfBooksBorrowed
        // if noOfBooksBorrowed are the same, then sort by age
        // print all the sorted Member details
    	
    	memberList.sort((a,b)->{
    		if(a.getNoOfBooksBorrowed() == b.getNoOfBooksBorrowed()) {
    			return a.getAge() - b.getAge();
    		}else {
    			return b.getNoOfBooksBorrowed() - a.getNoOfBooksBorrowed();
    		}
    	});
    	
    	for(Member member : memberList) {
    		System.out.println(member);
    		System.out.println();
    		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    		System.out.println();
    	}
    	
    }

    public void issueBook(int librarianId, int memberId, int bookId) {
        // Find the Librarian, Member, and Book objects by their respective IDs
        // Check if the book is available and the member can borrow books (based on a borrowing limit)
        // Update the book's availability, the librarian's noOfBooksIssued, and the member's noOfBooksBorrowed
        // Add the issued book to the bookMap
    	
    	Librarian librarian = null;
    	Book book = null;
    	Member member = null;
    	List<Book> booklist = null;
    	for(Librarian librarian1 : librarianList) {
    		if(librarian1.getId() == librarianId) {
    			librarian = librarian1;
    			break;
    		}
    	}
    	for(Map.Entry<Librarian, List<Book>> entry : bookMap.entrySet()) {
    		if(entry.getKey().getId() == librarianId) {
    			booklist = entry.getValue();
    			for(Book book1: entry.getValue()) {
    				if(book1.getId() == bookId) {
    					book = book1;
    					break;
    				}
    			}
    			break;
    		}
    	}
    	
    	for(Member member1:memberList) {
    		if(member1.getId() == memberId) {
    			member = member1;
    			break;
    		}
    	}
    	if(librarian == null || book == null || member == null) {
    		System.out.println(book+" "+member+librarian);
    		throw new RuntimeException("Didn't find all attribute");
    	}
    	if(book.isAvailable()) {
    		if(member.getNoOfBooksBorrowed() <= 3) {
    			book.setAvailable(false);
    			booklist.add(book);
    			bookMap.put(librarian, booklist);
    			System.out.println(book.getTitle()+" is issued to "+member.getName()+" by "+librarian.getName());
    			
    		}
    		else throw new RuntimeException("Member already borrowed more than 3 books");
    	}
    	else throw new RuntimeException("Book is already borrowed by some other person");
    }

    public void returnBook(int librarianId, int memberId, int bookId) {
        // Find the Librarian, Member, and Book objects by their respective IDs
        // Check if the book is currently borrowed by the member
        // Update the book's availability, the librarian's noOfBooksIssued, and the member's noOfBooksBorrowed
        // Remove the returned book from the bookMap
    	
    	Librarian librarian = null;
    	Book book = null;
    	Member member = null;
    	List<Book> bookList = null;
    	
    	for(Map.Entry<Librarian, List<Book>> entry : bookMap.entrySet()) {
    		if(entry.getKey().getId() == librarianId) {
    			librarian = entry.getKey();
    			bookList = entry.getValue();
    			for(Book book1: entry.getValue()) {
    				if(book1.getId() == bookId) {
    					book = book1;
    					break;
    				}
    			}
    		}
    		break;
    	}
    	for(Member member1:memberList) {
    		if(member1.getId() == memberId) {
    			member = member1;
    			break;
    		}
    	}
    	if(librarian == null || book == null || member == null) {
    		System.out.println(book+" "+member+librarian);
    		throw new RuntimeException("Didn't find all attribute");
    	}
    	if(!book.isAvailable()) {
    		if(member.getNoOfBooksBorrowed() <= 3) {
    			book.setAvailable(true);
    			member.setNoOfBooksBorrowed(member.getNoOfBooksBorrowed()-1);
    			bookList.remove(book);
    			bookMap.put(librarian, bookList);
    			System.out.println(book.getTitle()+" is returned by "+member.getName()+" to "+librarian.getName());
    			
    		}
    		else throw new RuntimeException("Member disn't borrowed this books");
    	}
    	else throw new RuntimeException("Book is not borrowed by any person");
    }
	
}
