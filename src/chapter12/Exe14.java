package chapter12;

public class Exe14 {
	private static Switch sw = new Switch();

	public static void f() throws OnOffException1, OnOffException2 {
	}

	public static void main(String[] args) {
		try {
			sw.on();
			f();
			throw new RuntimeException();
//			sw.off();
		} catch (OnOffException1 e) {
			System.out.println("OnOffException1");
			sw.off();
		}catch (OnOffException2 e) {
			System.out.println("OnOffException1");
			sw.off();
		}
	}
}
