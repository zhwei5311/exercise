package chapter15;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Mouse;
import typeinfo.pets.Pet;

public class Holder<T> {
	private T a, b, c;

	public Holder(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void setA(T a) {
		this.a = a;
	}

	public void setB(T b) {
		this.b = b;
	}

	public void setC(T c) {
		this.c = c;
	}

	public T getA() {
		return a;
	}
	
	public T getB() {
		return b;
	}
	
	public T getC() {
		return c;
	}
	public static void main(String[] args) {
		Holder<Pet> e = new Holder<Pet>(new Mouse("mouse"), new Dog("dog"), new Cat("cat"));
		System.out.println("Hold Three Object: " + e);
		Robot x = new Robot("bot1");
		Robot y = new Robot("bot2");
		Robot z = new Robot("bot3");
		Holder<Robot> h = 
			new Holder<Robot>(x, y, z);
		System.out.println("Holding: " + h);
	}
}
