package chapter14;

public class Triangle extends Shape {
	boolean flag = false;

	@Override
	public String toString() {
		return (flag ? "H" : "Uhh") + "Triangle";
	}

}
