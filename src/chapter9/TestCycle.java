package chapter9;

public class TestCycle {
	public static void main(String[] args) {
		new UniFactory().getUnicycle();
		new BiFactory().getBicycle();
		new TriFactory().geTricycle().draw();
	}
}
