package chapter15;

import java.util.ArrayList;

public class Shelf extends ArrayList<Product> {
	public Shelf(int nProducts) {
		Generators.fill(this, Product.generator,nProducts);
	}
}
