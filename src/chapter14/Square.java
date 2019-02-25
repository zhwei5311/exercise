package chapter14;

public class Square extends Shape {

	boolean flag = false;

	@Override
	public String toString() {
		return (flag ? "H" : "Uhh") + "Square";
	}

}
