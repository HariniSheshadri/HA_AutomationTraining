package com.healthasyst.practise;

//Create Student type and Create 3 different instance for storing below values

public class Task4Runner {

	public static void main(String[] args) {
		
		StudentTask4 stu1 = new StudentTask4();
		stu1.setStudentName("Jack");
		stu1.setStudentEmailID("jack@gmail.com");
		stu1.setStudentID(101);
		stu1.setStudentPercentage(75.0);
		StudentTask4.setSchoolName("Global School");
		
		StudentTask4 stu2 = new StudentTask4();
		stu2.setStudentName("Peter");
		stu2.setStudentEmailID("peter@gmailc.om");
		stu2.setStudentID(102);
		stu2.setStudentPercentage(85.0);
		StudentTask4.setSchoolName("Global School");
		
		StudentTask4 stu3 = new StudentTask4();
		stu3.setStudentName("Mark");
		stu3.setStudentEmailID("mark@gmail.com");
		stu3.setStudentID(102);
		stu3.setStudentPercentage(85.0);
		StudentTask4.setSchoolName("Global School");
		
		stu1.printStudentDetail();
		stu2.printStudentDetail();
		stu3.printStudentDetail();
		

	}

}
