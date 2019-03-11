package chapter9;

import chapter8.Note;

public class Wind implements Instrument,Playable {

	@Override
	public void play(Note n) {
		System.out.println(this + ".play()" + n);
	}
	
	public String toString() {
		return "Wind";
	}

	@Override
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
	
}
