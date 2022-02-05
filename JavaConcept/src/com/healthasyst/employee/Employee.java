package com.healthasyst.employee;

public class Employee {

	public int empID;
	public String empName;
	public double empSalary;
	public static String companyName;//Static value because company name is constant for all employees
	
	//Print employee detail using static method
	/*public static void printEmployeeDetail(Employee emp)
	{
		System.out.println(emp.empID);
		System.out.println(emp.empName);
		System.out.println(emp.empSalary);
		System.out.println(Employee.companyName);
		System.out.println("------------------------------");
		
	}*/
	
	//Print employee detail using non static method
	
	public void printEmployeeDetail()
	{
		//System.out.println(this);
		//System.out.println(this.empID);
		System.out.println(empID);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(Employee.companyName);
	}
	
}
