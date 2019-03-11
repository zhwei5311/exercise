package chapter9;

public class Bicycle implements Cycle {

	@Override
	public void draw() {
		System.out.println("Bicycle.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Bicycle.erase()");
	}

	@Override
	public void erea() {
		System.out.println("Bicycle.erea()");
	}

}
