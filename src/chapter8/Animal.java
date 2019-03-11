package chapter8;

public class Animal {
	public static void print(Rodent r) {
		System.out.println(r);
	}
	public static void printAll(Rodent[] r) {
		for(Rodent i: r) {
			print(i);
		}
	}
	public static void main(String[] args) {
		Rodent[] r = {
				new Mouse(),
				new Gerbil(),
				new Hamster(),
		};
		printAll(r);
	}
}
