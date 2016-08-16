package com.julia.course.address;

import java.util.Scanner;

public class AmericanPOBox extends Address{
	String country = "USA";
	String state;
	String poBox;
	String zipCode;
	Address anAddress;
	
	public AmericanPOBox(String pPOBox, String pCity, String pState, String pZipCode) {
		poBox = pPOBox;
		city = pCity;
		state = pState;
		zipCode = pZipCode;
	}
	
	public String getAddress(){
		String newAddress = (poBox + "\n"
				+ city + ", " + state + " " + zipCode + " " + country);
		newAddress = newAddress.replace('-', ' ');
		System.out.println(newAddress + "\n");
		return newAddress;
	}
	
	// setters and getters
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPoBox() {
		return poBox;
	}

	public void setPoBox(String poBox) {
		this.poBox = poBox;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
