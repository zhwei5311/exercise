package chapter15;

public class GenericMethods {
	public <T, U, V> void f(T x,Integer y,V z) {
		System.out.println(x.getClass().getName() + " | " 
				+ y.getClass().getName() + " | " + z.getClass().getName());
	}
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		gm.f("", 1, gm);
	}
}
