package com.ha.base;

public class Person {
	private String name;
	private long phonenumber;
	private String mailID;
	private String address;
	private static String schoolName;
	private static String schoolAddress;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getPhonenumber() {
		return phonenumber;
	}
	
	public void setPhonenumber(long phonenumber) {
		if(String.valueOf(phonenumber).length()==10) {
			this.phonenumber = phonenumber;	
		}else
		{
			System.out.println("Invalid phone number");
		}
		
		
	}

	
}
