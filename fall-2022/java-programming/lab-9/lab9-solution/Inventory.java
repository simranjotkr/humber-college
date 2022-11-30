package lab9;

public class Inventory {
	public static final String[] ITEM_LIST = { "TV-1", "TV-2", "Desktop-1", "Desktop-2", "Monitor-1", "Monitor-2",
			"Printer-1", "Printer-2" };
	public static final double[] PRICE_LIST = { 699, 749, 549, 689, 99, 149, 349, 479 };

	public static int findItem(String itemName) {
		int loc = -1; // not in the list
		for (int i = 0; i < ITEM_LIST.length; i++) {
			if (ITEM_LIST[i].equalsIgnoreCase(itemName)) {
				loc = i;
				break;
			}
		}
		return loc;
	}
}