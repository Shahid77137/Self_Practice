package com.masai;

import org.springframework.stereotype.Component;


public class Book {

	    private int id;
	    private String title;
	    private String author;
	    private String publicationYear;
	    private boolean isAvailable;
	    
	    
		@Override
		public String toString() {
			return "Book_id = " + id + ", title = " + title + ", author = " + author + ", publicationYear = " + publicationYear
					+ ", isAvailable = " + isAvailable + "\n";
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getAuthor() {
			return author;
		}


		public void setAuthor(String author) {
			this.author = author;
		}


		public String getPublicationYear() {
			return publicationYear;
		}


		public void setPublicationYear(String publicationYear) {
			this.publicationYear = publicationYear;
		}


		public boolean isAvailable() {
			return isAvailable;
		}


		public void setAvailable(boolean isAvailable) {
			this.isAvailable = isAvailable;
		}


		public Book(int id, String title, String author, String publicationYear, boolean isAvailable) {
			super();
			this.id = id;
			this.title = title;
			this.author = author;
			this.publicationYear = publicationYear;
			this.isAvailable = isAvailable;
		}
	    
	    
	
}
