package com.julia.course.name;

public class AsianName extends Name{
	
	public AsianName (String pFirstName, String pLastName, String pSecondLastName){
		firstName = pFirstName;
		lastName = pLastName;
		secondLastName = pSecondLastName;
	}
	
	public void getAsianName(){
		if (secondLastName != "") {
			System.out.println(lastName + secondLastName + firstName);
		}
		System.out.println(lastName + firstName);
	}

	public static void main (String args[]){

AsianName kyungin = new AsianName("Kim", "KyungIn", "");
kyungin.getAsianName();
	}
}
