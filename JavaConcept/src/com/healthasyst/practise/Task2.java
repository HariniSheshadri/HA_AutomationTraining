package com.healthasyst.practise;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		//Area of Square
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the input value to calculate area of square");
		int r = scan1.nextInt();
		System.out.println("Area of Square is  " + Area.areaOfSquare(r));
		
		//Area of Trapezium
		Scanner scan2 =new Scanner (System.in);
		System.out.println("Enter the input value to calculate area of trapezium");
		System.out.println("Enter the base value a");
		double a = scan1.nextInt();
		System.out.println("Enter the base value b");
		double b = scan1.nextInt();
		System.out.println("Enter the height value h");
		double h = scan1.nextInt();
		
		System.out.println("Area of Trapezium is " +Area.areaOfTrapezium(a,b,h));
		
	}

}
