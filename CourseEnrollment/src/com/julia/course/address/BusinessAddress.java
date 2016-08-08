package com.julia.course.address;

public class BusinessAddress extends Address{
	String country = "USA";
	String houseNumber;
	String street;
	String state;
	String poBox;
	String zipCode;
	String attention;
	String businessName;
	
	public BusinessAddress(String pAttention, String pBusinessName, String pHouseNumber, String pStreet, String pCity, String pState,
			String pZipCode) {
		businessName = pBusinessName;
		houseNumber = pHouseNumber;
		street = pStreet;
		city = pCity;
		state = pState;
		zipCode = pZipCode;
		attention = pAttention;
		
	}
	
	public void getBusinessAddress(){
		System.out.println("Attn: " + attention);
		System.out.println(businessName);
		System.out.println(houseNumber + " " + street);
		System.out.println(city + ", " + state + " " + zipCode);
		System.out.println(country);
	}
	
	public static void main (String args[]){

BusinessAddress kyungin = new BusinessAddress("KyungIn Kim", "Bryn Mawr College", "101", "Merion Ave", "Bryn Mawr", "PA", "19010");
kyungin.getBusinessAddress();
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

	public String getAttention() {
		return attention;
	}

	public void setAttention(String attention) {
		this.attention = attention;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
}

