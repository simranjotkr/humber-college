package lab6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		String choice = null;
		CustomerManager custManager = new CustomerManager();
		ItemManager itemManager = new ItemManager();

		try (Scanner sc = new Scanner(System.in)) {
			do {
				Item item = itemManager.createItem();
				Customer customer = custManager.createCustomer(item);
				MainClass.displayBill(customer, item);
				System.out.print("Do you have more orders to process(Y/N): ");
				choice = sc.nextLine();
			} while ("Y".equalsIgnoreCase(choice));
		}
	}

	public static double calcNetPayable(double orderAmount, double tax, double discPerc) {
		return ((orderAmount + tax) - (orderAmount * discPerc));
	}

	public static void displayBill(Customer customer, Item item) {
		System.out.println("-------------------INVOICE---------------------");
		System.out.println("Store Name and Location: " + AppConstants.STORE_NAME_LOCATION);
		System.out.println(
				"Date of invoice: " + new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime()));
		System.out.println("Customer Name: " + customer.getCustName());
		System.out.println("Item Name: " + item.getItemName());
		System.out.printf("Total Order Amount: $%.2f\n", item.getOrderAmount());
		System.out.printf("Tax to be Paid: $%.2f\n", item.getTaxOnItems());
		System.out.printf("Total Discount: $%.2f\n", item.getOrderAmount() * customer.getCustDisc());
		System.out.printf("Net Payable Amount: $%.2f\n",
				MainClass.calcNetPayable(item.getOrderAmount(), item.getTaxOnItems(), customer.getCustDisc()));
		System.out.println("------------------------------------------------");
		System.out.println("Assignment Submitted by: Simranjot Kaur");
		System.out.println("------------------------------------------------");
	}
}
