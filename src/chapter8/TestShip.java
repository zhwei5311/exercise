package chapter8;

public class TestShip {
	public static void main(String[] args) {
		Stages stages = new Stages();
		stages.performPlay();
		stages.change();
		stages.performPlay();
		stages.vary();
		stages.performPlay();
		stages.toStart();
		stages.performPlay();
	}
}
