package com.julia.course.address;

public class AmericanAddress extends Address {
	String country = "USA";
	String houseNumber;
	String street;
	String state;
	String poBox;
	String zipCode;
	
	public AmericanAddress(String pHouseNumber, String pStreet, String pCity, String pState,
			String pZipCode) {
		houseNumber = pHouseNumber;
		street = pStreet;
		city = pCity;
		state = pState;
		zipCode = pZipCode;
	}
	
	public void getAmericanAddress(){
		System.out.println(houseNumber + " " + street);
		System.out.println(city + ", " + state + " " + zipCode);
		System.out.println(country);
	}
	
	public static void main (String args[]){

AmericanAddress kyungin = new AmericanAddress("101", "Merion Ave", "Bryn Mawr", "PA", "19010");
kyungin.getAmericanAddress();
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

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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