package com.healthasyst.practise;

public class MultiplicationTableOf5 {
	
	public static void Sample4(int a, int b){
		
		int c;
		int sumofeven=0;
		int sumofodd=0;
		
		do {
			c=a*b;
			System.out.println(+a+"*"+b+ "=" + c);
			if(c%2==0)
			{
				sumofeven=sumofeven+c;
				
			}
			
			else
			{
				sumofodd=sumofodd+c;
				
			}
				
			b++;
		}while(b<=30);
		
		System.out.println("Sum of even results " +sumofeven);
		System.out.println("Sum of odd results " +sumofodd);
		
		
	}

}
