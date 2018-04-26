package chapter12;

public class Exe1 {
	public static void main(String[] args) {
		try {
			System.out.println("Throw new Exception");
			throw new Exception("Exe1's Exception!");
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			System.out.println("This is a verify words!");
		}
	}
}
