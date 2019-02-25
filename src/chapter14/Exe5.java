package chapter14;

import java.util.Arrays;
import java.util.List;

public class Exe5 {
	public static void rotate(Shape s) {
		if(!(s instanceof Circle)) {
			System.out.println(s + "rotate");
		}
	}
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(),
				new Square(), new Triangle(), new Rhomboid());
		for(Shape shape : shapeList) {
//			shape.draw();
		}
//		System.out.println();
		for(Shape shape : shapeList) {
			rotate(shape);
		}
	}
}
