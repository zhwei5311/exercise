package chapter9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RandomWords implements Readable {
	private static Random rand = new Random(47);
	private static final char[] capitals =
			"ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers = 
			"abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static final char[] vowels =
			"aeiou".toCharArray();
	private int count;
	public RandomWords(int count) {
		this.count = count;
	}
	@Override
	public int read(CharBuffer cb) throws IOException {
		if(count-- == 0) {
			return -1;
		}
		cb.append(vowels[rand.nextInt(vowels.length)]);
		cb.append(lowers[rand.nextInt(lowers.length)]);
		cb.append(" ");
		return 10;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new RandomWords(10));
		while(scanner.hasNext()) {
			System.out.println(scanner.next());
		}
	}

}
