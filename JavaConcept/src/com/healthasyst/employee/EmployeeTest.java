package com.healthasyst.employee;

public class EmployeeTest {
	public static void main(String args[]) {
		
		Employee.companyName="HA"; 
		
		//creating 3 objects for employee
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		
		emp1.empID=101;
		emp1.empName="Harini";
		emp1.empSalary=6000;
		
		emp2.empID=102;
		emp2.empName="Sushma";
		emp2.empSalary=10000;
		
		emp3.empID=103;
		emp3.empName="Punit";
		emp3.empSalary=8000;
		
		System.out.println(emp1);//printing the address

		System.out.println(emp2);//printing the address

		System.out.println(emp3);//printing the address
		
		
		//while using static method	
		//Employee.printEmployeeDetail(emp1);
		//Employee.printEmployeeDetail(emp2);
		//Employee.printEmployeeDetail(emp2);
		
		//while using non static method -calling by object reference
		
		emp1.printEmployeeDetail();
		emp2.printEmployeeDetail();
		emp3.printEmployeeDetail();
	}

}
