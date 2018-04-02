package chapter11;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Exe16 {
	static void vowelCounter(Set<String> st) {
		Set<Character> vowels = new TreeSet<>();
		Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
		int vowelsCount = 0;
		for (String s : st) {
			int count = 0;
			for (Character c : s.toCharArray()) {
				if (vowels.contains(c)) {
					count++;
					vowelsCount++;
				}
			}
			System.out.print(s + ":" + count + ", ");
		}
		System.out.println();
		System.out.println("Total vowels: " + vowelsCount);
	}

	public static void main(String[] args) {
//		Set<String> words = new TreeSet<>("SetOperations.java", "\\W+"));
//		System.out.println(words);
//		vowelCounter(words);
	}
}
