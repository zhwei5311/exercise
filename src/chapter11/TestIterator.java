package chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class TestIterator {
	int gerbilNumber;

	public TestIterator() {
		gerbilNumber = 0;
	}

	public int hop() {
		Random random = new Random();
		return 5;
	}

	public static void main(String[] args) {
		ArrayList<TestIterator> test = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			test.add(new TestIterator());
		}
		Iterator<TestIterator> iterator = test.iterator();
		while (iterator.hasNext()) {
			TestIterator ti = iterator.next();
			System.out.println(ti.hop());
		}
		System.out.println("------------------------------------------------------");
		 for (int i = 0; i < test.size(); i++) {
		 System.out.println(test.get(i).hop());
		 }
	}
}
