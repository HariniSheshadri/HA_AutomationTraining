package com.ha.groups;

import com.ha.base.Person;

public class Student extends Person {
	private int studentID;
	private double studentPercentage;
	private String courseCode;
	
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		
		if(studentID>100) {
			this.studentID = studentID;
		}else
		{
			System.out.println("Invalid");
		}
		
	}
	public double getStudentPercentage() {
		return studentPercentage;
	}
	public void setStudentPercentage(double studentPercentage) {
		
		if(studentPercentage >= 0 && studentPercentage<100) {
			this.studentPercentage = studentPercentage;	
		}
		else {
			System.out.println("Invalid percentage");
		}
		
	}
	
	public void printStudentDetail() 
	{
		System.out.println("StudentID " +this.studentID);
		System.out.println("Student Name " +super.getName());
		System.out.println("Student phone no "+super.getPhonenumber());
		System.out.println("Student percentage "+this.getStudentPercentage() );
	}
	
	public void provideCertification() {
		if (this.studentPercentage>50 && this.studentPercentage<100) {
			System.out.println("Student passed-Certification provided");
		}
		else if(this.studentPercentage<50) {
			System.out.println("Student failed, please try again");
		}
	}

}
