package com.healthasyst.shoppingcart;

public class Item {

	private int ID;
	private String description;
	private int quantity;
	private double price;

	// Constructor for Item class while passing args

	public Item(String description,int quantity,double price )
	{
		this.description=description;
		this.quantity=quantity;
		this.price=price;
	}
//constructor without argument
	public Item() {
		
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {

		if (quantity > 0 && quantity < 1000) {

			this.quantity = quantity;
		} else {
			System.out.println("Invalid input");
		}

	}

	public void printitemdetails() {
		System.out.println("Item description " + this.getDescription());
		System.out.println("Quantity is " + this.getQuantity());
		System.out.println("---------------------------------------------");
	}

}
