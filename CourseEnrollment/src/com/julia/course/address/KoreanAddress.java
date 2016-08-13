package com.julia.course.address;

import java.util.Scanner;

public class KoreanAddress extends Address {
	String country = "Republic of Korea";
	String dong_floor;
	String buildingNumber;
	String roadName;
	String eup_myeon;
	String city_gun_gu;
	String province_do;

	public KoreanAddress(String pDong_Floor, String pBuildingNumber, String pRoadName, String pEup_Myeon,
			String pCity_Gun_Gu, String pProvince_do, String pPostalCode) {
		dong_floor = pDong_Floor;
		buildingNumber = pBuildingNumber;
		roadName = pRoadName;
		eup_myeon = pEup_Myeon;
		city_gun_gu = pCity_Gun_Gu;
		province_do = pProvince_do;
		postalCode = pPostalCode;
	}
	
	public void getKoreanAddress(){
		String newAddress = (country + " " + dong_floor + " " + buildingNumber + " " + roadName + " " + eup_myeon +
				" " + city_gun_gu + " " + province_do + " " + postalCode);
		newAddress = newAddress.replace('-', ' ');
		System.out.println(newAddress + "\n");
	}
	
	public static void main (String args[]){

KoreanAddress kyungin = new KoreanAddress("8th Floor", "123", "Hannae-ro", "Yangseong-myeon",
		"Anseong-si", "Gyeonggi-do", "123-123");
kyungin.getKoreanAddress();
	}

	// setters and getters
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDong_floor() {
		return dong_floor;
	}

	public void setDong_floor(String dong_floor) {
		this.dong_floor = dong_floor;
	}

	public String getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public String getRoadName() {
		return roadName;
	}

	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}

	public String getEup_myeon() {
		return eup_myeon;
	}

	public void setEup_myeon(String eup_myeon) {
		this.eup_myeon = eup_myeon;
	}

	public String getCity_gun_gu() {
		return city_gun_gu;
	}

	public void setCity_gun_gu(String city_gun_gu) {
		this.city_gun_gu = city_gun_gu;
	}

	public String getProvince_do() {
		return province_do;
	}

	public void setProvince_do(String province_do) {
		this.province_do = province_do;
	}
}