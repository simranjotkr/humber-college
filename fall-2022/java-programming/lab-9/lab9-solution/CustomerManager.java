package lab9;

import java.util.Scanner;

public class CustomerManager {
	private int skus;
	public static int totalQuantity;

	CustomerManager() {
		totalQuantity = 0;
	}

	public int getSkus() {
		return skus;
	}

	public void setSkus(int skus) {
		this.skus = skus;
	}

	public Customer createNewCustomer() {
		Scanner sc = new Scanner(System.in);
		Customer cust = new Customer();
		System.out.print("Enter Customer Name: ");
		cust.setCustName(sc.nextLine());
		System.out.print("Enter Customer Phone Number: ");
		cust.setCustNumber(sc.nextLine());
		String moreOrders = "";
		int i = 0;
		boolean setFlag;
		do {
			setFlag = false;
			cust.purchasedItems[i] = new PurchasedItem();
			while (!setFlag) {
				System.out.print("Enter Item Name: ");
				setFlag = cust.purchasedItems[i].setName(sc.nextLine());
				if (!setFlag) {
					System.out.println(AppConstants.ERROR_WRONG_ITEM_NAME);
				}
			}
			while ((cust.purchasedItems[i].getQuantity() <= AppConstants.MIN_QUANTITY)
					|| (cust.purchasedItems[i].getQuantity() > AppConstants.MAX_QUANTITY)) {
				System.out.print("Enter the Quantity of Item Purchased: ");
				cust.purchasedItems[i].setQuantity(sc.nextInt());
				sc.nextLine();
				if ((cust.purchasedItems[i].getQuantity() <= AppConstants.MIN_QUANTITY)
						|| (cust.purchasedItems[i].getQuantity() > AppConstants.MAX_QUANTITY)) {
					System.out.println(AppConstants.ERROR_INVALID_QUANITY);
				} else {
					totalQuantity += cust.purchasedItems[i].getQuantity();
				}
			}
			System.out.print("Do you wish to add more orders(Y/N): ");
			moreOrders = sc.nextLine();
			i++;
		} while ((AppConstants.CHOICE_YES.equalsIgnoreCase(moreOrders)) && (i < cust.purchasedItems.length));
		this.skus = i;
		return cust;
	}
}
