package com.ha.groups;

import com.ha.base.Person;

public class Professor extends Person {
	private int professorId;
	private int departmentId;
	private String departmentName;
	private int experience;
	
	public int getProfessorId() {
		return professorId;
	}
	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public void displayProfessorDetail() {
		System.out.println("Professor name "+super.getName());
		System.out.println("Professor phone number " +super.getPhonenumber());
		System.out.println("Professor department " +this.getDepartmentName());
		System.out.println("Professor experience " +this.getExperience());
	}

}
