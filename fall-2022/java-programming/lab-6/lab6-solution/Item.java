package lab6;

/**
 * This is an entity class for Item and it has attributes for Name of item, Item
 * quantity and item price
 * 
 * @author simranjotkaur
 *
 */
public class Item {
	private String itemName;
	private int itemQty;
	private double itemPrice;

	Item() {
		this(AppConstants.NAME_UNKNOWN, 0, 0);
	}

	Item(String itemName) {
		this(itemName, 0, 0);
	}

	Item(String itemName, int itemQty) {
		this(itemName, itemQty, 0);
	}

	Item(String itemName, double itemPrice) {
		this(itemName, 0, itemPrice);
	}

	Item(String itemName, int itemQty, double itemPrice) {
		this.itemName = itemName;
		this.itemQty = itemQty;
		this.itemPrice = itemPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemQty() {
		return itemQty;
	}

	public void setItemQty(int itemQty) {
		if ((itemQty > AppConstants.MIN_QTY) && (itemQty <= AppConstants.MAX_QTY)) {
			this.itemQty = itemQty;
		}
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		if (itemPrice > 0) {
			this.itemPrice = itemPrice;
		}
	}

	public double getOrderAmount() {
		return this.getItemPrice() * this.getItemQty();
	}

	public double getTaxOnItems() {
		return this.getOrderAmount() * AppConstants.TAX;
	}

}
