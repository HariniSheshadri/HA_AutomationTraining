package com.healthasyst.practise;

public class TempMaxMin {
	
	public static double getMax(double[] temp) {
		
		double maxValue=temp[0];
		for (int i=1;i<temp.length;i++) {
			
			if(temp[i]>maxValue) 
			{
			maxValue=temp[i];
			}
		}
		return maxValue;
		
	}
	
	public static double getMin(double[] temp) {
		
		double minValue=temp[0];
		for(int i=1;i<temp.length;i++ ) {
			
			if(temp[i]<minValue) {
				minValue=temp[i];
			}
			
		}
		
		return minValue;
		
	}

}
