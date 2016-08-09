package com.julia.course.businessObject;

import java.util.Scanner;

import com.julia.course.address.*;
public class Person {
	
	String fullName;
	Address homeAddress = new Address();
	
	public Person(String pFullName, Address pHomeAddress){
		this.fullName = pFullName;
		this.homeAddress = pHomeAddress;
	}
	
	public Person(){}
	
	public void setAddress(){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the house number.");
		String houseNumber = input.next();
		System.out.println("Please enter the street name.");
		String streetName = input.next();
		System.out.println("Please enter the city.");
		String city = input.next();
		System.out.println("Please enter the state.");
		String state = input.next();
		System.out.println("Please enter the zipCode.");
		String zipCode = input.next();
		System.out.println(houseNumber + " " + streetName);
		System.out.println(city + ", " + state + " " + zipCode);
	}
	
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
