package com.healthasyst.practise;

public class StudentTask4 {

	private int studentID;
	private String studentName;
	private String studentEmailID;
	private double studentPercentage;
	private static String schoolName;

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmailID() {
		return studentEmailID;
	}

	public void setStudentEmailID(String studentEmailID) {
		this.studentEmailID = studentEmailID;
	}

	public double getStudentPercentage() {
		return studentPercentage;
	}

	public void setStudentPercentage(double studentPercentage) {
		this.studentPercentage = studentPercentage;
	}

	public static String getSchoolName() {
		return schoolName;
	}

	public static void setSchoolName(String schoolName) {
		StudentTask4.schoolName = schoolName;
	}
	
	public void printStudentDetail() 
	{
		System.out.println("StudentID " +this.studentID);
		System.out.println("Student Name " +this.getStudentName());
		System.out.println("Student emailID "+this.getStudentEmailID());
		System.out.println("Student Percentage "+this.getStudentPercentage() );
		System.out.println("Student Schooname "+getSchoolName() );
	} 

}
