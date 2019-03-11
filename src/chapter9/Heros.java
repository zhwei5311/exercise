package chapter9;

public class Heros implements ForthInterface {

	@Override
	public void first() {
		System.out.println("first()");
	}
	
	@Override
	public void second() {
		System.out.println("second()");
	}

	@Override
	public void third() {
		System.out.println("third()");
	}

	@Override
	public void forth() {
		System.out.println("forth()");
	}
	
	public static void t(FirstInterface f) {
		f.first();
	}
	public static void u(SecondInterface f) {
		f.second();
	}
	public static void v(ThirdInterface f) {
		f.third();
	}
	public static void w(ForthInterface f) {
		f.forth();
	}
	public static void main(String[] args) {
		Heros h = new Heros();
		t(h);
		u(h);
		v(h);
		w(h);
	}
}
