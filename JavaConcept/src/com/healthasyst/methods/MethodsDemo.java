package com.healthasyst.methods;

public class MethodsDemo {
	
	public static void main(String[] args) {
		int i=10;
		double base=25;
		double height=1;
		double circle=Area.areaOfCircle(i);
		System.out.println("Area of circle is " +circle);
		
		double triangle=Area.areaOfTriangle(base, height);
		System.out.println("Area of Triangle is "+triangle);
		
		double power=Math.pow(2, 3);
		System.out.println(power);
		
		double anynumber=Math.random();//inbuilt method from Math class
		System.out.println(anynumber);
		
	}

}
