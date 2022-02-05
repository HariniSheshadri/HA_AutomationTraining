package com.healthasyst.practise;

public class Area {

	public static int areaOfSquare(int r) {

		int result = 0;

		if (r > 0) {
			result = r * r;
		} else {
			System.out.println("Invalid input");
		}

		return result;
	}
	
	public static double areaOfTrapezium(double a, double b, double h) {
		
		double resultT=0;
		if(a>0 && b>0 && h>0) {
			double x=(a+b)*h;
			resultT=x/2;
		}
		else {
			System.out.println("Invalid input");
		}
		return resultT;
	}

}
