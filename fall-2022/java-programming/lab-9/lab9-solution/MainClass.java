package lab9;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		String choice = "";
		Scanner sc = new Scanner(System.in);
		CustomerManager custMgr;

		do {
			custMgr = new CustomerManager();
			Customer cust = custMgr.createNewCustomer();
			int skus = custMgr.getSkus();
			printInvoice(cust, skus, CustomerManager.totalQuantity);
			System.out.print("Do You Wish To Generate Bill For Another Customer(Y/N): ");
			choice = sc.nextLine();
		} while (AppConstants.CHOICE_YES.equalsIgnoreCase(choice));

	}

	private static void printInvoice(Customer cust, int skus, int totalQuantity) {
		System.out.println("-".repeat(36) + "Invoice" + "-".repeat(36));
		System.out.println("Customer Name: " + cust.getCustName());
		System.out.println("Phone: " + cust.getCustNumber());
		System.out.println("Item Name" + "\t\t" + "Quantity" + "\t\t" + "Unit Price" + "\t\t" + "Subtotal");
		for (int i = 0; i < skus; i++) {
			System.out.println(cust.purchasedItems[i].toString());
		}
		System.out.println("Total\t\t\t" + totalQuantity);
		System.out.println("-".repeat(80));
	}

}
