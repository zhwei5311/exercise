package chapter14;

public class Circle extends Shape {

	boolean flag = false;
	@Override
	public String toString() {
		return (flag ? "H" : "Uhh") + "Circle";
	}
	
}
