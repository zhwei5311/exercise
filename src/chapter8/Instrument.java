package chapter8;

public class Instrument {
	public void play(Note n) {
		System.out.println("INstrument.play()" + n);
	}
	public String what() {
		return "Instrument";
	}
	public void adjust() {
		System.out.println("Adjusting Instrument");
	}
	public String toString() {
		return what();
	}
}
