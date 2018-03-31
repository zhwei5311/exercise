package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Exes12 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8, 9));
		ListIterator<Integer> it1 = list1.listIterator();
		ListIterator<Integer> it2 = list2.listIterator();
		for (Integer i : list2) {
			System.out.print(i + " ");
		}
		System.out.println();
		while (it1.hasNext()) {
			it1.next();
		}
		while (it2.hasNext()) {
			it2.next();
		}
		while (it1.hasPrevious()) {
			it2.add(it1.previous());
		}
		for (Integer i : list2) {
			System.out.print(i + " ");
		}
	}
}
