package chapter15;

import chapter12.Exception2;
import typeinfo.pets.Dog;
import typeinfo.pets.EgyptianMau;
import typeinfo.pets.Mouse;
import typeinfo.pets.Pet;

public class Exe1<T> {
	private T a;
	public Exe1(T a) {
		this.a = a;
	}
	public void set(T a) {
		this.a = a;
	}
	public T get() {
		return a;
	}
	public static void main(String[] args) {
		Exe1<Pet> p = new Exe1<Pet>(new Pet());
		Pet pet = p.get();
		p.set(new Dog());
		System.out.println(p.get());
		p.set(new EgyptianMau());
		System.out.println(p.getClass().getSimpleName());
		System.out.println(p.get());
		Exe1<Pet> e1 = new Exe1<Pet>(new Mouse("Mickey"));
		System.out.println(e1.get());
	}
}
