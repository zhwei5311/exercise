package chapter8;

public class NewInstrument extends Instrument {
	public void play(Note n) {
		System.out.println("NewInstrument.play()" + n);
	}
	public String what() {
		return "NewInstrument";
	}
	public void adjust() {
		System.out.println("Adjusting NewInstrument");
	}
}
