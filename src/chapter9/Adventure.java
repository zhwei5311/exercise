package chapter9;

public class Adventure {
	public static void t(CanFight x) {
		x.fight();
	}
	public static void u(CanSwim x) {
		x.swim();
	}
	public static void v(Canfly x) {
		x.fly();
	}
	public static void x(CanClimb x) {
		x.climb();
	}
	public static void w(ActionCharacter x) {
		x.fight();
	}
	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
		x(h);
	}
}
