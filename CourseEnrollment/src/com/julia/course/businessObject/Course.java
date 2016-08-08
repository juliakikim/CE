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
		} else if (this.getCourseName().equals("chinese101")) {
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
		if (this.courseName.equals("chinese101")){
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
		
		// assign the professors who are teaching
		
		Professor kent = new Professor("kent");
		Professor huang = new Professor("huang");
		
		kent.teaching(phil101); 
		huang.teaching(chin101);
		
		
		Student julia = new Student("julia");
		studentBody.add(julia);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 'b' to begin.");
		String input = scanner.next();
		if (input.equals("b")){
		while (! input.equals("q")){
			System.out.println("Please enter 's' to search. Please enter 'c' to enroll students. Please enter 'l' to list commands. " +
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
				
				else if (! input.equals("q") && (input.equals("e") || input.equals("c"))){
				System.out.println("Please enter the course and student's name, followed by Enter.");
				String aCourseName = scanner.next();
				String aStudent = scanner.next();
				
					if (aCourseName.equals(chin101.getCourseName())){
						for (int i=0; i < studentBody.size(); i++){
							Student theStudent = studentBody.get(i);
							if (theStudent.getFullName().equals(aStudent)){
								chin101.enroll(theStudent);
								theStudent.enrolled(chin101);
							}
						}
						
					} else if (aCourseName.equals(phil101.getCourseName())){
						for (int i=0; i < studentBody.size(); i++){
							Student theStudent = studentBody.get(i);
							if (theStudent.getFullName().equals(aStudent)){
								phil101.enroll(theStudent);
								theStudent.enrolled(phil101);
							}
						}
						
					} else {
						System.out.println(aCourseName + " or " + aStudent + " is not found.");
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
						String theName = scanner.next();
						if (theName.equals(huang.getProfessorName())){
							huang.listWork();
						} else if (theName.equals(kent.getProfessorName())) {
							kent.listWork();
						 } else if (theName.equals(julia.getFullName())) {
							 julia.listWork();
						 } else {
							System.out.println(theName + " is not found.");
						 }
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