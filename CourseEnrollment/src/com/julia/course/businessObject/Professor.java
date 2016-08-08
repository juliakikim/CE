package com.julia.course.businessObject;

import java.util.ArrayList;

import com.julia.course.address.*;

public class Professor extends Worker{
	
	Worker worker = new Worker();
	public Professor(String pFullName){
		this.fullName = pFullName;
	}
	
	ArrayList listofTeachingCourses = new ArrayList();
	Worker aWorker;
	
	public ArrayList teaching (Course aCourse) {
		if (aCourse == null) {
			System.out.println(aCourse + " is not found.");
		} else {
		listofTeachingCourses.add(aCourse); }
		return listofTeachingCourses; }
	
	public void listTeaching () {
		System.out.println("for professor - " + this.fullName);
		int size = listofTeachingCourses.size();
		for (int i = 0; i < size; i++){
			Course aCourse = (Course) listofTeachingCourses.get(i);
			System.out.println(aCourse.getCourseName()); }
		System.out.print("\n");}
	
	public void listWork() {
		listTeaching();
	}
	
	public String getProfessorName(){
		return this.fullName;
	}

	public ArrayList getListofTeachingCourses() {
		return listofTeachingCourses;
	}

	public void setListofTeachingCourses(ArrayList listofTeachingCourses) {
		this.listofTeachingCourses = listofTeachingCourses;
	}
}
