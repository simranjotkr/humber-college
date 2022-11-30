package lab6;

import java.util.Scanner;

public class CustomerManager {
	Scanner sc = new Scanner(System.in);
	double orderTotal = 0;

	public Customer createCustomer(Item item) {
		Customer customer = new Customer();

		System.out.print("Enter Customer Name: ");
		customer.setCustName(sc.nextLine());

		while (!AppConstants.CUST_TYPE_RETAIL.equalsIgnoreCase(customer.getCustType())
				&& !AppConstants.CUST_TYPE_WHOLESALE.equalsIgnoreCase(customer.getCustType())) {
			System.out.print("Enter the Type of Customer(R/WS): ");
			customer.setCustType(sc.nextLine());
			if (!AppConstants.CUST_TYPE_RETAIL.equalsIgnoreCase(customer.getCustType())
					&& !AppConstants.CUST_TYPE_WHOLESALE.equalsIgnoreCase(customer.getCustType())) {
				System.out.println("Invalid Customer Type. Press Enter to Continue.");
			}
		}

		if (AppConstants.CUST_TYPE_RETAIL.equalsIgnoreCase(customer.getCustType())) {
			orderTotal = item.getOrderAmount();
			if (orderTotal >= 1000) {
				customer.setCustDisc(AppConstants.DISC_TEN_PERC);
			}
		} else if (AppConstants.CUST_TYPE_WHOLESALE.equalsIgnoreCase(customer.getCustType())) {
			orderTotal = item.getOrderAmount();
			if (orderTotal < 500) {
				customer.setCustDisc(AppConstants.DISC_TEN_PERC);
			} else if (orderTotal >= 500 && orderTotal <= 1000) {
				customer.setCustDisc(AppConstants.DISC_TWENTY_PERC);
			} else if (orderTotal > 1000) {
				customer.setCustDisc(AppConstants.DISC_THIRTY_PERC);
			}
		}
		return customer;
	}
}
