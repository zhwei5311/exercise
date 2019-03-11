package chapter8;

public class TestCycle {
	public static void main(String[] args) {
		Unicycle unicycle = new Unicycle("Unicycle");
		Bicycle bicycle = new Bicycle("Bicycle");
		Tricycle tricycle = new Tricycle("Tricycle");
		Cycle.ride(unicycle);
		Cycle.ride(bicycle);
		Cycle.ride(tricycle);
		unicycle.wheels(3);
		bicycle.wheels(5);
		tricycle.wheels(7);
	}
}
