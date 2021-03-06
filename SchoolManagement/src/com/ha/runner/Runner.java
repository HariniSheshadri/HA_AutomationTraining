package com.ha.runner;

import com.ha.groups.Professor;
import com.ha.groups.Student;

public class Runner {

	public static void main(String[] args) {
		// Create an object for Student to allocate memory

		Student stu1 = new Student();
		stu1.setName("Jane Davis");
		stu1.setPhonenumber(9813728234L);
		stu1.setStudentID(101);
		stu1.setStudentPercentage(45.0);
		
		Student stu2 = new Student();
		stu2.setName("Chad Davis");
		stu2.setPhonenumber(9844728234L);
		stu2.setStudentID(102);
		stu2.setStudentPercentage(85.0);
		
		stu1.printStudentDetail();
		stu1.provideCertification();
		
		stu2.printStudentDetail();
		stu2.provideCertification();
		
		Professor p1=new Professor();
		p1.setProfessorId(001);
		p1.setName("Prof. Seetaramaiah");
		p1.setPhonenumber(1234567890L);
		p1.setDepartmentId(3);
		p1.setDepartmentName("Physics");
		p1.setExperience(40);
		
		Professor p2=new Professor();
		p2.setProfessorId(002);
		p2.setName("Prof. Latha");
		p2.setPhonenumber(1987654321L);
		p2.setDepartmentId(4);
		p2.setDepartmentName("Chemistry");
		p2.setExperience(20);
		
		p1.displayProfessorDetail();
		p2.displayProfessorDetail();
	}

}
