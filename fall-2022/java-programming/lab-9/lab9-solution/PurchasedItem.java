package lab9;

public class PurchasedItem {
	private String name;
	private int quantity;
	private double price;

	public PurchasedItem() {
		this("", 0);
	}

	public PurchasedItem(String name, int quantity) {
		this.setName(name);
		this.setQuantity(quantity);
	}

	public boolean setName(String name) {
		int loc = Inventory.findItem(name);
		if (loc >= 0) {
			this.name = name;
			this.price = Inventory.PRICE_LIST[loc];
			return true;
		} else {
			return false;
		}
	}

	public void setQuantity(int quantity) {
		if ((quantity > AppConstants.MIN_QUANTITY) && (quantity <= AppConstants.MAX_QUANTITY)) {
			this.quantity = quantity;
		}
	}

	public String getName() {
		return this.name;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public double getPrice() {
		return this.price;
	}

	public double getSubTotal() {
		return this.price * this.quantity;
	}

	public String toString() {
		return name + "\t\t\t" + quantity + "\t\t\t" + price + "\t\t\t" + this.getSubTotal();
	}
}
