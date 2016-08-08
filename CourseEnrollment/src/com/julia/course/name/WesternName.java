package com.julia.course.name;

public class WesternName extends Name{
	String middleName;
	String suffix;
	
	public WesternName (String pFirstName, String pMiddleName, String pLastName, String pSecondLastName, String pSuffix){
		firstName = pFirstName;
		middleName = pMiddleName;
		lastName = pLastName;
		secondLastName = pSecondLastName;
		suffix = pSuffix;
	}
	
	public void getWesternName(){
		if (secondLastName != "") {
			System.out.println(firstName + " " + middleName + " " + lastName + "-" + secondLastName + " " + suffix);
		}
		System.out.println(firstName + " " + middleName + " " + lastName + " " + suffix);
	}

	public static void main (String args[]){

WesternName jamie = new WesternName("Jamie", "Jane", "Foster", "", "");
jamie.getWesternName();
	}
	
// setters and getters
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
}