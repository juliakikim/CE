package com.julia.course.address;

public class ChineseAddress extends Address{
	String country = "China";
	String province;
	String district;
	String street;
	String streetNumber;
	String buildingName_number;
	String roomNumber;

	public ChineseAddress(String pProvince, String pCity, String pDistrict, String pStreet,
			String pStreetNumber, String pBuildingName_Number, String pRoomNumber, String pPostalCode) {
		city = pCity;
		province = pProvince;
		district = pDistrict;
		street = pStreet;
		streetNumber = pStreetNumber;
		buildingName_number = pBuildingName_Number;
		roomNumber = pRoomNumber;
		postalCode = pPostalCode;
	}
	
	public void getChineseAddress(){
		System.out.println(country + " " + postalCode);
		System.out.println(province + " " + city + " " + district + " " + street + " " + streetNumber +
				" " + buildingName_number + " " + roomNumber);
	}
	
	public static void main (String args[]){

ChineseAddress kyungin = new ChineseAddress("Liaoning", "Dalian", "Shahekou", "Zhongshan", "123",
		"Wandahuafu", "902", "116000");
kyungin.getChineseAddress();
	}
	
	// setters and getters
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getBuildingName_number() {
		return buildingName_number;
	}

	public void setBuildingName_number(String buildingName_number) {
		this.buildingName_number = buildingName_number;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
}