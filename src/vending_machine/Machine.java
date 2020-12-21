package vending_machine;

import java.text.NumberFormat;


import java.util.Scanner;

/**
 * 
 * @author Michael Flasco
 * @date 12/19/2020
 *
 */

// Application class created
public class Machine {

	static Item item;
	static Purchase purchase;
	static Scanner input;
	static double money = 0;
	static String selection = null;
	static NumberFormat formatter = NumberFormat.getCurrencyInstance();

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
// TODO Auto-generated method stub
		
		// Global variables created
		input = new Scanner(System.in);
		item = new Item();
		boolean run = true;
		while (run) {
			displayMenu();
		}
	}

	/**
	 * Function created to display initial vending machine menu
	 * 
	 * @return amount of money
	 */
	public static double displayMenu() {

		boolean menu = true;
		while (menu) {

			// Determine if user has added money to machine
			if (money != 0) {

				System.out.println("\n====== Vending Machine Menu =======");
				int i;

				// Loop through items in vending machine
				for (i = 0; i < item.menu.size(); i++) {
					System.out.println(item.menu.get(i));
				}
				System.out.println("\nAmount: " + formatter.format(money));
				menu = false;

			} else {

				// If there no money has been added menu repeats
				System.out.println("====== Vending Machine =======");
				System.out.println("\nPlease insert cash or change:");
				money = input.nextDouble();
				String test = String.valueOf(money);

			}

			// After money has been added prompt user to make a selection
			userChoice();
		}

		return money;

	}

	// Function to allow user to make a selection

	public static void userChoice() {
		String confirm = null;
		String id = null;
		System.out.println("\nMake your selection: ");
		selection = input.nextLine();
		Item selectedItem = null;
		boolean itemFound = true;

		// Loop through items and determine if the user input matches the ID of the item
		// selected
		for (int i = 0; i < item.menu.size(); i++) {
			id = item.menu.get(i).getId();
			if (selection.equals(id)) {
				selectedItem = item.menu.get(i);
				System.out.println(
						"Confirm Purchase (Y/N): " + selectedItem.getName() + " Price: " + selectedItem.getPrice());
				itemFound = true;
				confirm = input.nextLine();

				// Make separate function
				if (confirm.equals("y")) {
					purchase = new Purchase(selectedItem.name, selectedItem.getPrice());
					System.out.println("Vending: " + purchase.getItemName() + " " + purchase.getItemPrice());
				} else {
					System.out.println("Transaction Cancelled");
				}
			}
		}
	}

}
