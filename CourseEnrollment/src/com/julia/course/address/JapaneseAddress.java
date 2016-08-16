package com.julia.course.address;

import java.util.Scanner;

public class JapaneseAddress extends Address {
	String country = "Japan";
	String prefecture;
	String district;
	String chome;
	String banchi;
	String buildingName;
	String buildingNumber;
	String roomNumber;
	Address anAddress;

	public JapaneseAddress(String pPrefecture, String pDistrict, String pCity,
			String pChome, String pBanchi, String pBuildingName, String pBuildingNumber, String pRoomNumber, String pPostalCode) {
		city = pCity;
		prefecture = pPrefecture;
		district = pDistrict;
		chome = pChome;
		banchi = pBanchi;
		buildingName = pBuildingName;
		buildingNumber = pBuildingNumber;
		roomNumber = pRoomNumber;
		postalCode = pPostalCode;
	}
	
	public String getAddress(){
		String newAddress = (country + "〒" + postalCode + "\n" +
					prefecture + " " + city + " " + district + " " + chome + " " + banchi +
					" " + buildingName + " " + buildingNumber + " " + roomNumber);
		newAddress = newAddress.replace('-', ' ');
		System.out.println(newAddress + "\n");
		return newAddress;}
	
	
	//setters and getters
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPrefecture() {
		return prefecture;
	}

	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getChome() {
		return chome;
	}

	public void setChome(String chome) {
		this.chome = chome;
	}

	public String getBanchi() {
		return banchi;
	}

	public void setBanchi(String banchi) {
		this.banchi = banchi;
	}


	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
}