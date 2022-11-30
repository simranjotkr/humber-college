package lab6;

import java.util.Scanner;

public class ItemManager {
	Scanner sc = new Scanner(System.in);

	public Item createItem() {
		Item item = new Item();
		System.out.print("Enter the name of Item purchased: ");
		item.setItemName(sc.nextLine());
		
		while (item.getItemQty() <= 0 || item.getItemQty() > 10) {
			System.out.print("Enter Quantity of Item: ");
			item.setItemQty(sc.nextInt());
			sc.nextLine();
			if (item.getItemQty() <= 0 || item.getItemQty() > 10) {
				System.out.println("Invalid Quantity. Press Enter to Continue");
			}
		}
		
		while (item.getItemPrice() <= 0) {
			System.out.print("Enter the Unit Price of Item: $");
			item.setItemPrice(sc.nextDouble());
			sc.nextLine();
			if (item.getItemPrice() <= 0) {
				System.out.println("Invalid Quantity. Press Enter to Continue");
			}
		}
		
		
		return item;
	}
}
