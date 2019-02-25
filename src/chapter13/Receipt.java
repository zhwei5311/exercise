package chapter13;

import java.util.Formatter;

public class Receipt {
	private double total = 0;
	private Formatter f = new Formatter(System.out);
	public final int ITEM_WIDTH = 15;
	public final int QTY_WIDTH = 5;
	public final int PRICE_WIDTH = 10;
	public final int PRICISION_FLOAT_WIDHT = 2;
	public final int PRICISION_String_WIDHT = 15;
	public final String TITLE_FORMAT = "%-" + ITEM_WIDTH + "s %" + QTY_WIDTH + "s %" + PRICE_WIDTH + "s\n";
	public final String PRICE_FORMAT = "%-" + ITEM_WIDTH + "." + PRICISION_String_WIDHT + "s %" + QTY_WIDTH + "d %"
			+ PRICE_WIDTH + "." + PRICISION_FLOAT_WIDHT + "f\n";
	public final String TOTAL_FORMAT = "%-" + ITEM_WIDTH + "s %" + QTY_WIDTH + "s %" + PRICE_WIDTH + "."
			+ PRICISION_FLOAT_WIDHT + "f\n";

	public void printTitle() {
		f.format(TITLE_FORMAT, "Item", "Qty", "Price");
		f.format(TITLE_FORMAT, "----", "---", "-----");
	}

	public void printTotal() {
		f.format(TOTAL_FORMAT, "Tax", "", total * 0.06);
		f.format(TITLE_FORMAT, "", "", "-----");
		f.format(TOTAL_FORMAT, "Total", "", total * 1.06);
	}

	public void print(String name, int qty, double price) {
		f.format(PRICE_FORMAT, name, qty, price);
		total += price;
	}

	public static void main(String[] args) {
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("Jack`s Magic Beans", 4, 4.25);
		receipt.print("Princess Peas", 3, 5.1);
		receipt.print("Three Bears Porridge", 1, 14.29);
		receipt.printTotal();
	}
}
