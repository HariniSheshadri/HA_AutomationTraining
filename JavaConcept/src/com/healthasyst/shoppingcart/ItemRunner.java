package com.healthasyst.shoppingcart;

public class ItemRunner {

	public static void main(String[] args) {
		Item I1=new Item("Shirt",1,100);
		Item I2=new Item();
		
	//	I1.setDescription("Shirt");
	//	I1.setQuantity(5);
		
		I2.setDescription("Laptop");//update through setter and getter
	    I2.setQuantity(3);
		I1.setQuantity(25);
	    
		I1.printitemdetails();
		I2.printitemdetails();
		

	}

}
