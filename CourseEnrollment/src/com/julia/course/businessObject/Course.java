package com.julia.course.businessObject;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;

import com.julia.course.address.Address;
import com.julia.course.address.AmericanAddress;


public class Course{
	static ArrayList <Course> catalog = new ArrayList();
	static ArrayList <Student> studentBody = new ArrayList();
	static ArrayList <Professor> faculty= new ArrayList();
	Map<String, Student> chineseEnrollment = new HashMap<String, Student>();
	Map<String, Student> philEnrollment = new HashMap<String, Student>();
	String courseName;
	String courseTime;
	String courseDay;
	int courseSeats;
	String coursePeriod;
	int courseCredit;
	Professor courseInstructor;
	
	public Course(String pCourseName, int pCourseSeats, String pCourseDay,
			String pCourseTime, String pCoursePeriod, int pCourseCredit){ // construct
		this.courseName = pCourseName;
		this.courseSeats = pCourseSeats;
		this.courseDay = pCourseDay;
		this.courseTime = pCourseTime;
		this.coursePeriod = pCoursePeriod;
		this.courseCredit = pCourseCredit;
	}
	
	public void enroll (Student aStudent){
		if (aStudent == null) { // not really needed, but just in case
			System.out.println(aStudent + " is not found.");
		} else if (this.getCourseName().equals("chin101")) {
			if (chineseEnrollment.get(aStudent.getFullName()) != null){
			System.out.println(aStudent.getFullName() + " is already enrolled in " + this.courseName + ".\n");
			} else {
			chineseEnrollment.put(aStudent.getFullName(), aStudent);
			this.courseSeats -= 1;
			}
		}
		else if (this.getCourseName().equals("phil101")) {
			if (philEnrollment.get(aStudent.getFullName()) != null){
			System.out.println(aStudent.getFullName() + " is already enrolled in " + this.courseName + ".\n");
			} else {
			philEnrollment.put(aStudent.getFullName(), aStudent);
			this.courseSeats -= 1;
			}
		}
		}
		
	public void listEnrolledStudents (){
		if (this.courseName.equals("chin101")){
			System.out.println("for course - " + this.courseName);
			System.out.println(chineseEnrollment.keySet());
			System.out.println("There are " + this.courseSeats + " seats left for " + this.courseName + ".\n");
		} else if (this.courseName.equals("phil101")) {
			System.out.println("for course - " + this.courseName);
			System.out.println(philEnrollment.keySet());
			System.out.println("There are " + this.courseSeats + " seats left for " + this.courseName + ".\n");
		} else {
			System.out.println("Invalid course name.\n");
		}}
	
	public static void listCatalog(){
		System.out.println("Name\tSeats\tDay\tTime\tPeriod\tCredit\tInstructor");
		for (int i=0; i < catalog.size(); i++){
			Course aCourse = catalog.get(i);
			System.out.println(aCourse.getCourseName() + "\t" + aCourse.getCourseSeats()
					+ "\t" + aCourse.getCourseDay() + "\t" + aCourse.getCourseTime()
					+ "\t" + aCourse.getCoursePeriod() + "\t" + aCourse.getCourseCredit() +
					"\t" + aCourse.getCourseInstructor().getFullName());
		}
	}
	
	public static void main(String[] args) throws IOException{

		Course chin101 = new Course("chin101", 5, "MWF", "9-10", "AM", 1);
		Course phil101 = new Course("phil101", 5, "TR", "2-3", "PM", 1);
		catalog.add(chin101);
		catalog.add(phil101);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 'b' to begin.");
		String input = scanner.next();
		if (input.equals("b")){
		while (! input.equals("q")){
			System.out.println("Please enter 's' to search. Please enter 'a' to add people. Please enter 'l' to list commands. " +
					"Otherwise, please enter 'q' to quit.");
					input = scanner.next();
				if (! input.equals("q") && input.equals("s")){
					System.out.print("Here are available commands - \n"
							+ "'showCatalog': shows the catalog. \n"
							+ "'searchPeriod': lists all courses available that period. \n"
							+ "'searchDay': lists all courses available that/those day/s. \n"
							+ "Please enter the command followed by Enter. \n");
					String command = scanner.next();
					
					if (command.equals("showCatalog")){
						listCatalog();
					}
					
					else if (command.equals("searchPeriod")){
						System.out.println("Please enter 'AM' or 'PM'");
						String thePeriod = scanner.next();
						if (thePeriod.equals("AM")){
							for (int i=0; i < catalog.size(); i++){
								Course aCourse = catalog.get(i);
								if (aCourse.getCoursePeriod().equals("AM")) System.out.println(aCourse.getCourseName());
							}
						} else {
							for (int i=0; i < catalog.size(); i++){
								Course aCourse = catalog.get(i);
								if (aCourse.getCoursePeriod().equals("PM")) System.out.println(aCourse.getCourseName());
						}	
					}
					}
					
					else if (command.equals("searchDay")){
						System.out.println("Please enter: \n"
								+ "'M' for Monday \n"
								+ "'T' for Tuesday \n"
								+ "'W' for Wednesday \n"
								+ "'R' for Thursday \n"
								+ "'F' for Friday \n"
								+ "'S' for Saturday \n"
								+ "'N' for Sunday \n");
						String theCourseDay = scanner.next();
						int sum = 0;
						for (int i=0; i < catalog.size(); i++){
							Course aCourse = catalog.get(i);
							if (aCourse.getCourseDay().contains(theCourseDay)) {
								System.out.println(aCourse.getCourseName());
								sum += 1;
							}
						}
						if (sum == 0)
							System.out.println("No course is taught on that/those days.");
						}
					else {
						System.out.println("Invalid command. Please try again.");
					}
					}
				
				else if (! input.equals("q") && (input.equals("a"))){
					System.out.print("Here are available commands - \n"
							+ "'enroll' (space) 'name of the course' (space) 'name of the student': \n"
							+ "enrolls the student to the course. \n"
							+ "'teach' (space) 'name of the course' (space) 'name of the professor': \n"
							+ "assigns the professor to teach the course. \n"
							+ "'set' (space) 'address' (space) 'name of the professor or the student': \n"
							+ "sets the address of the professor or the student. \n"
							+ "WARNING: please first enroll a student or assign a professor to teach \n"
							+ "before setting the address. \n");
					System.out.println("Please enter the command, followed by the enter.");
					String input1 = scanner.next();
					String input2 = scanner.next();
					String input3 = scanner.next();
					if (input1.equals("enroll")){
						if (false == studentBody.contains(input3)){
							Student aStudent = new Student(input3);
							studentBody.add(aStudent);	
						}
						for (int j=0; j < studentBody.size(); j++){
							Student aStudent = studentBody.get(j);
							if (input3.equals(aStudent.getFullName())){
								if (input2.equals(chin101.getCourseName())){
									chin101.enroll(aStudent);
									aStudent.enrolled(chin101);
									break;
								}else if (input2.equals(phil101.getCourseName())){
									phil101.enroll(aStudent);
									aStudent.enrolled(phil101);
									break;
								}else {
									System.out.println(input2 + " is not found.");}
							}}
							
					}else if (input1.equals("teach")){
						if (false == faculty.contains(input3)){
							Professor aProfessor = new Professor(input3);
							faculty.add(aProfessor);	
						}
						for (int i=0; i < faculty.size(); i++){
							Professor aProfessor = faculty.get(i);
							if (input3.equals(aProfessor.getFullName())){
								if (input2.equals(chin101.getCourseName())){
									aProfessor.teaching(chin101);
									break;
								}else if (input2.equals(phil101.getCourseName())){
									aProfessor.teaching(phil101);
									break;
								}else {
									System.out.println(input2 + " is not found.");}
							}}
			
						// add course component
						// fix if there is a duplicate
					
					// better way to implement this?
					}else if (input1.equals("set")){
						int check = 0;	
						for (int i=0; i < faculty.size(); i++){
							Professor aProfessor = faculty.get(i);
							if (input3.equals(aProfessor.getFullName())){
								aProfessor.setAddress();
								check = 1;
								break;
							}}
						for (int j=0; j < studentBody.size(); j++){
							Student aStudent = studentBody.get(j);
							if (input3.equals(aStudent.getFullName())){
								aStudent.setAddress();
								check = 1;
								break;
							}}
						if (check == 0) System.out.println("The person was not found. Please try again.");
					}else{
						System.out.println("Invalid command. Please try again.");
					}
				}			
				
				else if (!input.equals("q") && input.equals("l")){
					System.out.print("Here are available commands - \n"
							+ "'listwork' (space) 'professor's last name': lists all courses that a professor teaches. \n"
							+ "'listwork' (space) 'student's name': lists all courses that a student takes. \n"
							+ "'liststudent' (space) 'course name': lists all students enrolled in a course. \n"
							+ "Please enter the command followed by Enter. \n");
					
					String command = scanner.next();
					if (command.equals("listwork")){
						int check = 0;
						String theName = scanner.next();
						for (int i=0; i < faculty.size(); i++){
							Professor aProfessor = faculty.get(i);
							if (theName.equals(aProfessor.getFullName())){
								aProfessor.listWork();
								check = 1;
								break;
							}}
						for (int j=0; j < studentBody.size(); j++){
							Student aStudent = studentBody.get(j);
							if (theName.equals(aStudent.getFullName())){
								aStudent.listWork();
								check = 1;
								break;
							}}
						if (check == 0) System.out.println("The person was not found. Please try again.");
					}
					else if (command.equals("liststudent")){
						String theCourseName = scanner.next();
						if (theCourseName.equals(chin101.getCourseName())){
							chin101.listEnrolledStudents();
						} else if (theCourseName.equals(phil101.getCourseName())) {
							phil101.listEnrolledStudents();
						} else {
							System.out.println("The course does not exist.");
						}
					}
					else {
						System.out.println("Please try again.");
					}
				}
				else {
					System.out.println("Invalid input. Please try again.");
				}
		}
		scanner.close();
		}else{
			System.out.println("Invalid input. Please start the program again.");
		}
	}

	// setters and getters
	public String getCourseName() {
		return courseName;
	}

	public Map<String, Student> getChineseEnrollment() {
		return chineseEnrollment;
	}

	public void setChineseEnrollment(Map<String, Student> chineseEnrollment) {
		this.chineseEnrollment = chineseEnrollment;
	}

	public Map<String, Student> getPhilEnrollment() {
		return philEnrollment;
	}

	public void setPhilEnrollment(Map<String, Student> philEnrollment) {
		this.philEnrollment = philEnrollment;
	}

	public int getCourseSeats() {
		return courseSeats;
	}

	public void setCourseSeats(int courseSeats) {
		this.courseSeats = courseSeats;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseTime() {
		return courseTime;
	}

	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}

	public String getCourseDay() {
		return courseDay;
	}

	public void setCourseDay(String courseDay) {
		this.courseDay = courseDay;
	}

	public String getCoursePeriod() {
		return coursePeriod;
	}

	public void setCoursePeriod(String coursePeriod) {
		this.coursePeriod = coursePeriod;
	}

	public int getCourseCredit() {
		return courseCredit;
	}

	public void setCourseCredit(int courseCredit) {
		this.courseCredit = courseCredit;
	}

	public static ArrayList<Course> getCatalog() {
		return catalog;
	}

	public static void setCatalog(ArrayList<Course> catalog) {
		Course.catalog = catalog;
	}

	public Professor getCourseInstructor() {
		return courseInstructor;
	}

	public void setCourseInstructor(Professor courseInstructor) {
		this.courseInstructor = courseInstructor;
	}
	
	}