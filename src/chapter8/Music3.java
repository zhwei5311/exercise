package chapter8;

public class Music3 {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e) {
		for(Instrument i : e) {
			tune(i);
			System.out.println(i.toString());
		}
	}
	public static void main(String[] args) {
		NewInstrument newInstrument = new NewInstrument();
		Instrument[] orchestra = {
				new Wind(),
				new percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};
		tuneAll(orchestra);
		newInstrument.play(Note.B_FLAT);
	}
}
