package chapter8;

public class Brass extends Wind {
	public void play(Note n) {
		System.out.println("Brass.play()" + n);
	}
	public void adjust() {
		System.out.println("Adjusting Brass");
	}
}
