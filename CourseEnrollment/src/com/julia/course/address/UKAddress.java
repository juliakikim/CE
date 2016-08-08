package com.julia.course.address;

public class UKAddress extends Address{
	String country = "UK";
	String houseNumber;
	String street;
	String locality;
	String postTown;
	
	public UKAddress(String pHouseNumber, String pStreet, String pPostTown,
			String pPostalCode) {
		houseNumber = pHouseNumber;
		street = pStreet;
		postTown = pPostTown;
		postalCode = pPostalCode;
	}
	
	public void getUKAddress(){
		System.out.println(houseNumber + " " + street);
		System.out.println(postTown);
		System.out.println(postalCode);
		System.out.println(country);
	}
	
	public static void main (String args[]){

UKAddress kyungin = new UKAddress("42", "8 Flitcroft Street", "London", "WC2H 8DL");
kyungin.getUKAddress();
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


