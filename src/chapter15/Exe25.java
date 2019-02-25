package chapter15;

public class Exe25 {
	static <T extends First> void a(T t) {
		System.out.println("a(" + t + ")");
	}
	static <T extends Second> void b(T t) {
		System.out.println("b(" + t + ")");
	}
	public static void main(String[] args) {
		Third third = new Third();
//		Exe25 e = new Exe25();
		Exe25.a(third);
		Exe25.b(third);
	}
}
