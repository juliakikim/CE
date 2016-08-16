package com.julia.course.businessObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.julia.course.address.Address;
import com.julia.course.address.AmericanAddress;
import com.julia.course.address.AmericanPOBox;
import com.julia.course.address.ChineseAddress;
import com.julia.course.address.JapaneseAddress;
import com.julia.course.address.KoreanAddress;
import com.julia.course.address.UKAddress;
import com.julia.course.businessObject.*;
public class Person {
	
	Map<String, String> listofAddresses = new HashMap<String, String>();
	String fullName;
	String anAddress;
	String location;
	
	public Person(String pFullName){
		this.fullName = pFullName;
	}
	
	public Person(){}
	
	public void setAddress(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number: \n"
				+ "1 - American Address \n"
				+ "2 - American P.O. Box \n"
				+ "3 - Chinese Address \n"
				+ "4 - Japanese Address \n"
				+ "5 - Korean Address \n"
				+ "6 - UK Address \n");
		int number = scanner.nextInt();
		// any loophole?
		switch(number){
		case 1: {setAmericanAddress(); listofAddresses.put(this.fullName+location, anAddress); break;}		
		case 2: {setAmericanPOBox(); listofAddresses.put(this.fullName+location, anAddress); break;}
		case 3: {setChineseAddress(); listofAddresses.put(this.fullName+location, anAddress); break;}
		case 4: {setJapaneseAddress(); listofAddresses.put(this.fullName+location, anAddress); break;}
		case 5: {setKoreanAddress(); listofAddresses.put(this.fullName+location, anAddress); break;}
		case 6: {setUKAddress(); listofAddresses.put(this.fullName+location, anAddress); break;}
	}}
	
	public void setAmericanAddress(){
		Scanner input = new Scanner(System.in);
		System.out.println("WARNING: Please enter '-' for any space.");
		System.out.println("Please enter the house number.");
		String houseNumber = input.next();
		System.out.println("Please enter the street name.");
		String streetName = input.next();
		System.out.println("Please enter the city.");
		String city = input.next();
		System.out.println("Please enter the state.");
		String state = input.next();
		System.out.println("Please enter the zipCode.");
		String zipCode = input.next();
		AmericanAddress newAddress = new AmericanAddress(houseNumber, streetName, city, state, zipCode);
		anAddress = newAddress.getAddress();
	}
	
	public void setAmericanPOBox(){
		Scanner input = new Scanner(System.in);
		System.out.println("WARNING: Please enter '-' for any space.");
		System.out.println("Please enter the P.O.Box.");
		String POBox = input.next();
		System.out.println("Please enter the city.");
		String city = input.next();
		System.out.println("Please enter the state.");
		String state = input.next();
		System.out.println("Please enter the zipCode.");
		String zipCode = input.next();
		AmericanPOBox newAddress = new AmericanPOBox (POBox,
				city, state, zipCode);
		anAddress = newAddress.getAddress();}
	
	public void setUKAddress(){
		Scanner input = new Scanner(System.in);
		System.out.println("WARNING: Please enter '-' for any space.");
		System.out.println("Please enter the house number.");
		String houseNumber = input.next();
		System.out.println("Please enter the street.");
		String street = input.next();
		System.out.println("Please enter the post town.");
		String postTown = input.next();
		System.out.println("Please enter the postal code.");
		String postalCode = input.next();
		UKAddress newAddress = new UKAddress(houseNumber, street,
				postTown, postalCode);
		anAddress = newAddress.getAddress();
	}
	
	public void setJapaneseAddress(){
		Scanner input = new Scanner(System.in);
		System.out.println("WARNING: Please enter '-' for any space.");
		System.out.println("Please enter the prefecture.");
		String prefecture = input.next();
		System.out.println("Please enter the city.");
		String city = input.next();
		System.out.println("Please enter the district.");
		String district = input.next();
		System.out.println("Please enter the chome.");
		String chome = input.next();
		System.out.println("Please enter the banchi.");
		String banchi = input.next();
		System.out.println("Please enter the building name.");
		String buildingName = input.next();
		System.out.println("Please enter the building number.");
		String buildingNumber = input.next();
		System.out.println("Please enter the room number.");
		String roomNumber = input.next();
		System.out.println("Please enter the postalCode.");
		String postalCode = input.next();
		JapaneseAddress newAddress = new JapaneseAddress(prefecture, district, city,
				chome, banchi, buildingName, buildingNumber, roomNumber, postalCode);
		anAddress = newAddress.getAddress();
	}
	
	public void setChineseAddress(){
		Scanner input = new Scanner(System.in);
		System.out.println("WARNING: Please enter '-' for any space.");
		System.out.println("Please enter the province.");
		String province = input.next();
		System.out.println("Please enter the city.");
		String city = input.next();
		System.out.println("Please enter the district.");
		String district = input.next();
		System.out.println("Please enter the street name.");
		String street = input.next();
		System.out.println("Please enter the street number.");
		String streetNumber = input.next();
		System.out.println("Please enter the building name.");
		String buildingName = input.next();
		System.out.println("Please enter the building number.");
		String buildingNumber = input.next();
		System.out.println("Please enter the room number.");
		String roomNumber = input.next();
		System.out.println("Please enter the postalCode.");
		String postalCode = input.next();
		ChineseAddress newAddress = new ChineseAddress(postalCode, province, city, district, street, streetNumber, 
				buildingNumber, buildingName, roomNumber);
		anAddress = newAddress.getAddress();
	}
	
	public void setKoreanAddress(){
		Scanner input = new Scanner(System.in);
		System.out.println("WARNING: Please enter '-' for any space.");
		System.out.println("Please enter the province/do.");
		String province_do = input.next();
		System.out.println("Please enter the city/gun/gu.");
		String city_gun_gu = input.next();
		System.out.println("Please enter the eup/myeon.");
		String eup_myeon = input.next();
		System.out.println("Please enter the road name.");
		String roadName = input.next();
		System.out.println("Please enter the building number.");
		String buildingNumber = input.next();
		System.out.println("Please enter the dong/floor.");
		String dong_floor = input.next();
		System.out.println("Please enter the postalCode.");
		String postalCode = input.next();
		KoreanAddress newAddress = new KoreanAddress(dong_floor, buildingNumber,
				roadName, eup_myeon, city_gun_gu, province_do, postalCode);
		anAddress = newAddress.getAddress();
	}
	
	public void setHomeAddress(){
		location = "Home";
		setAddress();
	}
	
	public void setOtherAddress(){
		location = "Other";
		setAddress();
	}
	
	public void setWorkAddress(){
		location = "Work";
		setAddress();
	}
	
	public void setSchoolAddress(){
		location = "School";
		setAddress();
    }
	
	public void listHomeAddress(){
		if (listofAddresses.get(this.fullName+"Home") == null){
			System.out.println("there is no home address associated with this person");
		}else{
			System.out.println(listofAddresses.get(this.fullName+"Home"));
		}
	}
	
	public void listWorkAddress(){
		if (listofAddresses.get(this.fullName+"Work") == null){
			System.out.println("there is no home address associated with this person");
		}else{
			System.out.println(listofAddresses.get(this.fullName+"Work"));
		}
	}
	
	public void listSchoolAddress(){
		if (listofAddresses.get(this.fullName+"School") == null){
			System.out.println("there is no home address associated with this person");
		}else{
			System.out.println(listofAddresses.get(this.fullName+"School"));
		}
	}
	
	// setters and getters
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
