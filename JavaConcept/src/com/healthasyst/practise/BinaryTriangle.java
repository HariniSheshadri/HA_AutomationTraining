package com.healthasyst.practise;

public class BinaryTriangle {
	
	public static void DisplayBinaryTriangle(int rows) {
		
		int i;
		int j;
		for(i=1;i<=rows;i++) {
			
			for(j=1;j<=i;j++) {
				if(i%2==1) {
					System.out.println("0");
				}
				else {
					System.out.println("1");
					System.out.println("\n");
				}
					
			}
		}
		
	}

}
