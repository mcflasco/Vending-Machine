package vending_machine;

import java.util.ArrayList;

/**
 * @author Michael Flasco
 * @date 12/19/2020
 */

public class Purchase {

	// Array list created to track purchases
	ArrayList<Purchase> purchase = new ArrayList<Purchase>();

	private String itemName;
	private double itemPrice;

	/**
	 * Constructor created for new purchases
	 * 
	 * @param itemName
	 * @param itemPrice
	 */
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
