package com.julia.course.address;

public class Address {
	String city;
	String postalCode;
	String country;
	
	
	public Address(String pCity, String pPostalCode, String pCountry) {
		city = pCity;
		postalCode = pPostalCode;
		country = pCountry;
	}
	
	public Address(){
		
	}
	
	
	
	// setters and getters
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}

