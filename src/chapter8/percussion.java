package chapter8;

public class percussion extends Instrument {
	public void play(Note n) {
		System.out.println("Percussion.play()" + n);
	}
	public String what() {
		return "Percussion";
	}
	public void adjust() {
		System.out.println("Adjusting Percussion");
	}
}
