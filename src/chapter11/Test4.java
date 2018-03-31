package chapter11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Test4 {
	public static void main(String[] args) {
		int n = 10;
		Generator gen = new Generator();
		String[] s = new String[10];
		gen.fillAll(s);
		for(String a:s) {
			System.out.println(a + " ");
		}
		System.out.println("-----------------------------------");
		System.out.println(gen.fill(new ArrayList<String>(), n));
		System.out.println(gen.fill(new LinkedList<String>(), n));
		System.out.println(gen.fill(new HashSet<String>(), n));
		System.out.println(gen.fill(new LinkedHashSet<>(), n));
		System.out.println(gen.fill(new TreeSet<>(), n));
	}
}
