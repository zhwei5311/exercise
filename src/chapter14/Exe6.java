package chapter14;

import java.util.Arrays;
import java.util.List;

public class Exe6 {
	public static void setFlag(Shape s) {
		if(s instanceof Circle) {
			((Circle)s).flag = true;
		}
	}
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(),
				new Square(), new Triangle());
		for(Shape shape : shapeList) {
			setFlag(shape);
			System.out.println(shape);
		}
	}
}
