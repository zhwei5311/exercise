package chapter12;

public class Exe3 {
	public static int a[] = new int[3];
	public static void main(String[] args) {
		try {
			a[3] = 4;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
