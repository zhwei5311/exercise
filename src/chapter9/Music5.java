package chapter9;

import chapter8.Note;

public class Music5 {
	public static void tune(Playable p) {
		p.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Playable[] e) {
		for(Playable p:e) {
			tune(p);
		}
	}
	
	public static void main(String[] args) {
		Playable[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new WoodWind()
		};
		tuneAll(orchestra);
	}
}
