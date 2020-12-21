package vending_machine;

import java.util.ArrayList;

public class Purchase {

	ArrayList<Purchase> purchase = new ArrayList<Purchase>();
	
	private String itemName;
	private double itemPrice;
	
	public Purchase(String itemName, double itemPrice) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
}
