package com.julia.course.businessObject;

import com.julia.course.address.*;
public class Person {
	
	String fullName;
	Address homeAddress = new Address();
	
	public Person(String pFullName, Address pHomeAddress){
		this.fullName = pFullName;
		this.homeAddress = pHomeAddress;
	}
	
	public Person(){}
	
	// setters and getters
	public String getFullName() {
		return fullName;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
