package chapter9;

public class TestMonth implements Month {
	Month month = new Month() {
		int MARCH = 3;
	};
	public static void main(String[] args) {
		System.out.println(Month.FEBRUARY);
	}
}
