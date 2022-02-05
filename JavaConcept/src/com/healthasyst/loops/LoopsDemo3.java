package com.healthasyst.loops;

public class LoopsDemo3 {
	public static void main(String[] args) {
		//for each is mostly used in COllections
		int[] numbers= {10,20,30,40,50};
		
		for (int num: numbers)
		{
			System.out.println(num);
		}
		
		String[] colors= {"red","green","blue"};
		
		for(String s: colors)
		{
			System.out.println(s);
		}
	}

}
