package com.masai;

import org.springframework.stereotype.Component;


public class Member {

	private int id;
    private String name;
    private int age;
    private int noOfBooksBorrowed;
    private String email;
    private int mobile;
    
    
    
	@Override
	public String toString() {
		return "Member_id = " + id + ", name = " + name + ", age = " + age + ", noOfBooksBorrowed = " + noOfBooksBorrowed
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
	public int getNoOfBooksBorrowed() {
		return noOfBooksBorrowed;
	}
	public void setNoOfBooksBorrowed(int noOfBooksBorrowed) {
		this.noOfBooksBorrowed = noOfBooksBorrowed;
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

	public Member(int id, String name, int age, int noOfBooksBorrowed, String email, int mobile) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.noOfBooksBorrowed = noOfBooksBorrowed;
		this.email = email;
		this.mobile = mobile;
	}
    
    
	
}
