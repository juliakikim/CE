package com.julia.course.address;

public class AmericanPOBox extends Address{
	String country = "USA";
	String state;
	String poBox;
	String zipCode;
	
	public AmericanPOBox(String pPOBox, String pCity, String pState, String pZipCode) {
		poBox = pPOBox;
		city = pCity;
		state = pState;
		zipCode = pZipCode;
	}

	public void getAmericanPOBox(){
		System.out.println(poBox);
		System.out.println(city + ", " + state + " " + zipCode);
		System.out.println(country);
	}
	
	public static void main (String args[]){

AmericanPOBox kyungin = new AmericanPOBox("P.O. Box 1234", "Bryn Mawr", "PA", "19010");
kyungin.getAmericanPOBox();
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
