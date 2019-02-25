package chapter15;

import typeinfo.pets.Cat;
import typeinfo.pets.Mouse;
import typeinfo.pets.Pet;
import typeinfo.pets.Rodent;

public class Exe28 {
	static <T> void f1(Generic1<? super T> obj, T item) {
		obj.set(item);
	}

	static <T> T f2(Generic2<? extends T> obj) {
		return obj.get();
	}

	public static void main(String[] args) {
		Generic1<Rodent> generic1 = new Generic1<>();
		f1(generic1, new Mouse());
		Generic2<Pet> generic2 = new Generic2<>();
		Pet pet = f2(generic2);
		Generic2<Cat> generic3 = new Generic2<>();
		Cat cat = f2(generic3);
		pet = f2(generic3);
	}
}
