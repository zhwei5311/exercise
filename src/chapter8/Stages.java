package chapter8;

public class Stages {
	Startship startship = new SuspendShip();
	public void change() {
		startship = new Stopship();
	}
	public void vary() {
		startship = new Endship();
	}
	public void toStart() {
		startship = new Startship();
	}
	public void performPlay() {
		startship.alertStatus();
	}
}
