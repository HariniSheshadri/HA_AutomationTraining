package com.healthasyst.practise;

public class OddEvenCalculator{
	
	public static int calculateOddEven(int input){
		
	for(int i=input;i<=30;i++)
	{
		if(i%2==0)
		{
			System.out.println("The number is even");
			break;
			
		}
		else 
		{
			System.out.println("The number is odd");
			break;
		}
		
	}
	return input;

}
}