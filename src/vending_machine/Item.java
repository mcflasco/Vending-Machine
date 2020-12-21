package vending_machine;

import java.text.NumberFormat;

/**
 * @author Michael Flasco
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Item {
	NumberFormat formatter = NumberFormat.getCurrencyInstance();
//	HashMap<Integer, Item> menu = new HashMap<Integer, Item>();
	ArrayList<Item> menu = new ArrayList<Item>();

	String name;
	int quantity;
	double price;
	String id;

	public Item() {
		menu.add(new Item("Snickers", 10, 1.50, "1"));
		menu.add(new Item("Chips", 10, .50, "2"));
		menu.add(new Item("Coke", 10, 1.75, "3"));

	}

	public Item(String name, int quantity, double price, String id) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.id = id;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return name + ", " + "Price: " + formatter.format(price) + ", Number: " + id;
	}

	
	

}
