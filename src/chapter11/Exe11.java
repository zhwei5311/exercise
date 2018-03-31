package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Exe11 {
	public static void display(Collection c) {
		Iterator it = c.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
//		Collection<Integer> col = new ArrayList<>();
//		for (int i = 0; i < 5; i++) {
//			col.add(i);
//		}
//		Iterator<Integer> it = col.iterator();
//		while (it.hasNext()) {
//			Integer in = it.next();
//			System.out.println(in.toString());
//		}
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3));
		LinkedList<Character> ll = new LinkedList<>(Arrays.asList('a','b','c'));
		HashSet<Float> hs = new HashSet<>(Arrays.asList(1.1f,2.2f,3.3f));
		TreeSet<Double> ts = new TreeSet<>(Arrays.asList(1.1,2.2,3.3));
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>(Arrays.asList(7,8,9));
		display(al);
		display(ll);
		display(hs);
		display(ts);
		display(lhs);
	}
}
