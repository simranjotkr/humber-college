package lab9;

public class Customer {
	private String custName;
	private String custNumber;
	PurchasedItem[] purchasedItems = new PurchasedItem[Inventory.ITEM_LIST.length];

	Customer() {
		this("","");
	}

	Customer(String custName, String custNumber) {
		super();
		this.custName = custName;
		this.custNumber = custNumber;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustNumber() {
		return custNumber;
	}

	public void setCustNumber(String custNumber) {
		this.custNumber = custNumber;
	}

}
