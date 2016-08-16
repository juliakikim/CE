package com.julia.course.address;

import java.util.Scanner;

public class UKAddress extends Address{
	String country = "UK";
	String houseNumber;
	String street;
	String locality;
	String postTown;
	Address anAddress;
	
	public UKAddress(String pHouseNumber, String pStreet, String pPostTown,
			String pPostalCode) {
		houseNumber = pHouseNumber;
		street = pStreet;
		postTown = pPostTown;
		postalCode = pPostalCode;
	}
	
	public String getAddress(){
		String newAddress = (houseNumber + " " + street + "\n"
				+ postTown + "\n"
				+ postalCode + "\n"
				+ country);
		newAddress = newAddress.replace('-', ' ');
		System.out.println(newAddress + "\n");
		return newAddress;}



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

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getPostTown() {
		return postTown;
	}

	public void setPostTown(String postTown) {
		this.postTown = postTown;
	}
}


