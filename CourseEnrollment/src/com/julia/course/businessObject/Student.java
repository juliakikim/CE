package com.julia.course.businessObject;
import java.util.ArrayList;

public class Student extends Worker{
	
	ArrayList listofEnrolledCourses = new ArrayList();
		
	Worker worker = new Worker();
	
	public Student(String pFullName){
		this.fullName = pFullName;
	}
	
	public ArrayList enrolled (Course aCourse) {
		if (aCourse == null) {
			System.out.println(aCourse + " is not found.");
		} else {
		listofEnrolledCourses.add(aCourse); }
		return listofEnrolledCourses; }
	
	public void listEnrolled() {
		System.out.println("for student - " + this.fullName);
		int size = listofEnrolledCourses.size();
		for (int i = 0; i < size; i++){
			Course aCourse = (Course) listofEnrolledCourses.get(i);
			System.out.println(aCourse.getCourseName()); }
		System.out.print("\n");}
	
	public void listWork(){
		listEnrolled();
	}
	
	public ArrayList getListofEnrolledCourses() {
		return listofEnrolledCourses;
	}

	public void setListofEnrolledCourses(ArrayList listofEnrolledCourses) {
		this.listofEnrolledCourses = listofEnrolledCourses;
	}
}