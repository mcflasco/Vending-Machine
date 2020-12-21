package vending_machine;

import java.text.NumberFormat;

import java.util.Scanner;

public class Machine {

	static Item item;
	static Purchase purchase;
	static Scanner input;
	static double money = 0;
	static String selection = null;
	static NumberFormat formatter = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		input = new Scanner(System.in);
		item = new Item();
		boolean run = true;
		while (run) {
			displayMenu();

		}

	}

	public static double displayMenu() {

		boolean menu = true;
		while (menu) {
			if (money != 0) {

				System.out.println("\n====== Vending Machine Menu =======");
				int i;
				for (i = 0; i < item.menu.size(); i++) {
					System.out.println(item.menu.get(i));
				}
				System.out.println("\nAmount: " + formatter.format(money));
				menu = false;

			} else {

				System.out.println("====== Vending Machine =======");
				System.out.println("\nPlease insert cash or change:");
				money = input.nextDouble();
				String test = String.valueOf(money);

			}
			userChoice();
		}

		
		return money;

	}

	public static void userChoice() {
		String confirm = null;
		String id = null;
		System.out.println("\nMake your selection: ");
		selection = input.nextLine();
		Item selectedItem = null;
		boolean itemFound = true;

		for (int i = 0; i < item.menu.size(); i++) {
			id = item.menu.get(i).getId();
			if (selection.equals(id)) {
				selectedItem = item.menu.get(i);
				System.out.println("Confirm Purchase (Y/N): " + selectedItem.getName() + " Price: " + selectedItem.getPrice());
				itemFound = true;
				confirm = input.nextLine();
				
				// Make seperate function
				if(confirm.equals("y")) {
					purchase = new Purchase(selectedItem.name, selectedItem.getPrice());
					System.out.println("Vending: " + purchase.getItemName() + " " + purchase.getItemPrice());
				} else {
					System.out.println("Transaction Cancelled");
				}
				
			
			}
		}
	}

}
