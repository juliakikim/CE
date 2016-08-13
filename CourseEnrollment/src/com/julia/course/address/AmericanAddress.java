package com.julia.course.address;

import java.util.Scanner;
import com.julia.course.businessObject.*;
public class AmericanAddress extends Address {
	String country = "USA";
	String houseNumber;
	String streetName;
	String state;
	String poBox;
	String zipCode;
	
	public AmericanAddress(String pHouseNumber, String pStreetName, String pCity, String pState,
			String pZipCode) {
		houseNumber = pHouseNumber;
		streetName = pStreetName;
		city = pCity;
		state = pState;
		zipCode = pZipCode;
	}
	
	public void getAmericanAddress(){
		String newAddress = (houseNumber + " " + streetName + "\n"
				+ city + ", " + state + " " + zipCode + " " + country);
		newAddress = newAddress.replace('-', ' ');
		System.out.println(newAddress + "\n");
	}
	
	public static void main (String args[]){
	}

	// setters and getters
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
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