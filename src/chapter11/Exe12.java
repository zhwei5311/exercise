package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Exe12 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
		ListIterator<Integer> it = list.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--------------------------------");
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}
}
