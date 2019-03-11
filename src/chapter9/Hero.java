package chapter9;

public class Hero extends ActionCharacter implements CanFight, Canfly, CanSwim, CanClimb {

	@Override
	public void swim() {
		System.out.println("swim()");
	}

	@Override
	public void fly() {
		System.out.println("fly()");
	}

	@Override
	public void climb() {
		System.out.println("climb()");
	}

}
