package com.masai;

import org.springframework.stereotype.Component;


public class Librarian {

	private int id;
    private String name;
    private int age;
    private int noOfBooksIssued;
    private String email;
    private int mobile;
    
	@Override
	public String toString() {
		return "Librarian_id = " + id + ", name = " + name + ", age = " + age + ", noOfBooksIssued = " + noOfBooksIssued
				+ ", email = " + email + ", mobile = " + mobile + "\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNoOfBooksIssued() {
		return noOfBooksIssued;
	}

	public void setNoOfBooksIssued(int noOfBooksIssued) {
		this.noOfBooksIssued = noOfBooksIssued;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public Librarian() {};
	
	public Librarian(int id, String name, int age, int noOfBooksIssued, String email, int mobile) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.noOfBooksIssued = noOfBooksIssued;
		this.email = email;
		this.mobile = mobile;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + mobile;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfBooksIssued;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Librarian other = (Librarian) obj;
		if (age != other.age)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (mobile != other.mobile)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfBooksIssued != other.noOfBooksIssued)
			return false;
		return true;
	}

	
 
}
