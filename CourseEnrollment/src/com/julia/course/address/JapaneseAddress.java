package com.julia.course.address;

public class JapaneseAddress extends Address {
	String country = "Japan";
	String prefecture;
	String district;
	String chome;
	String banchi;
	String buildingName_number;
	String roomNumber;

	public JapaneseAddress(String pPrefecture, String pDistrict, String pCity,
			String pChome, String pBanchi, String pBuildingName_Number, String pRoomNumber, String pPostalCode) {
		city = pCity;
		prefecture = pPrefecture;
		district = pDistrict;
		chome = pChome;
		banchi = pBanchi;
		buildingName_number = pBuildingName_Number;
		roomNumber = pRoomNumber;
		postalCode = pPostalCode;
	}
	
	public void getJapaneseAddress(){
		System.out.println(country + "〒" + postalCode);
		System.out.println(prefecture + " " + city + " " + district + " " + chome + " " + banchi +
				" " + buildingName_number + " " + roomNumber);
	}
	
	public static void main (String args[]){

JapaneseAddress kyungin = new JapaneseAddress("Toranomon", "Minato-ku", "Tokyo", "", "", "2-5-10", "", "105-8487");
kyungin.getJapaneseAddress();
	}

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