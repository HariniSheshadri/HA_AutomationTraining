package com.healthasyst.practise;

import java.util.Scanner;

public class PractiseAssignments {

	public static void main(String[] args) {
		
		//Sample1 Odd Even Calculator
			int i=35;
			int Number=OddEvenCalculator.calculateOddEven(i);
			System.out.println("The number is "+Number);
	
	
		//Sample2 Print the sequence
			int a=3;
			int b=1;
			PrintTheSequence.Sequence(a, b);
	
	//Sample 3 Display sum of even results find the result and check whether it is odd or even? (Range is 0 to 50)
			int result=DisplaySumOfEvenResults.EvenResult();
			System.out.println(+result);
		
	//Sample 4 	Display multiplication table of 5 until the upper limit is 30
	//And find the even and odd results and also find the count of even or odd results and display at the end.
		int x=5;
		int y=1;
		MultiplicationTableOf5.Sample4(x, y);
		
	//Sample 6 Write a program which takes two integers N and M and produces last samples of N of the integers from N-1 to N-M.
	
		int n=2;
		int m=0;
		ProduceLastSamples.Sample6(n, m);
		
	//Sample7 Array input which takes daily temp and display max min values
		
		double[] temp= {10.0, 11.3, 4.5, -2.0, 3.6, -3.3, 0.0};
		double max=TempMaxMin.getMax(temp);
		double min=TempMaxMin.getMin(temp);
		
		System.out.println("Max temp "+max);
		System.out.println("Min temp "+min);
		
	//Sample 8 Take input and display the binary triangle--this prog is not giving right o/p need to check
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=scan.nextInt();
		
		BinaryTriangle.DisplayBinaryTriangle(rows);
		
	//Sample 10 
	}
}

