package com.julia.course.address;

import java.util.Scanner;

public class ChineseAddress extends Address{
	String country = "China";
	String province;
	String district;
	String street;
	String streetNumber;
	String buildingName;
	String buildingNumber;
	String roomNumber;
	Address anAddress;

	public ChineseAddress(String pProvince, String pCity, String pDistrict, String pStreet,
			String pStreetNumber, String pBuildingName, String pBuildingNumber, String pRoomNumber, String pPostalCode) {
		city = pCity;
		province = pProvince;
		district = pDistrict;
		street = pStreet;
		streetNumber = pStreetNumber;
		buildingName = pBuildingName;
		buildingNumber = pBuildingNumber;
		roomNumber = pRoomNumber;
		postalCode = pPostalCode;
	}
	
	public String getAddress(){
		String newAddress = (country + " " + postalCode + "\n"
				+ province + " " + city + " " + district + " " + street + " " + streetNumber +
				" " + buildingNumber + " "  + buildingName+ " " + roomNumber);
		newAddress = newAddress.replace('-', ' ');
		System.out.println(newAddress + "\n");
		return newAddress;}
	
	public static void main (String args[]){
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


	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
}