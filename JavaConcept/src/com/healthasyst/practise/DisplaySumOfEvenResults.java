package com.healthasyst.practise;

public class DisplaySumOfEvenResults {
	
	public static int EvenResult() {
		
		int sumofeven=0;
		
	for(int i=0;i<=50;i++)
	{
		if(i%2==0)
		{
			sumofeven=sumofeven+i;
			System.out.println(+i);
			
		}
	
	}
	return (sumofeven);
}
}
