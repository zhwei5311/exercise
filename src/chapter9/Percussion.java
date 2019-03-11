package chapter9;

import chapter8.Note;

public class Percussion implements Instrument,Playable {

	@Override
	public void play(Note n) {
		System.out.println(this + ".play()" + n);
	}
	
	public String toString() {
		return "Percussion";
	}

	@Override
	public void adjust() {
		System.out.println(this + ".adjust()");
	}

}
