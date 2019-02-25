package chapter15;

public class SixTuple<A, B, C, D, E, F> {
	public final A first;
	public final B second;
	public final C third;
	public final D fourth;
	public final E fifth;
	public final F sixth;

	public SixTuple(A a, B b, C c, D d, E e, F f) {
		first = a;
		second = b;
		third = c;
		fourth = d;
		fifth = e;
		sixth = f;
	}
	
	public String toString() {
		return "(" + first + "," + second + ","
				+ third + "," + fourth + ","
				+ fifth + "," + sixth + ";";
	}
}
