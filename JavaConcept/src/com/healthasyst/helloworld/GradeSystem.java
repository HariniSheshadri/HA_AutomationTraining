package com.healthasyst.helloworld;

public class GradeSystem {
	
	public static void main(String[] args) {
		int marks=80;
		
		//allocate grade
		if (marks>=90 && marks<=100)
		{
			System.out.println("Grade is A with marks"+marks);
		}
		else if (marks>=80 && marks<=89)
		{
			System.out.println("Grade is B with marks"+marks);
		}
		else if (marks>=60 && marks<=79)
		{
			System.out.println("Grade is C with marks"+marks);	
		}
		else if (marks<60)
		{
			System.out.println("Grade is Fail");
		}
		else if (marks>=100 || marks<0)
		{
			System.out.println("Invalid input");
		}
	}

}
