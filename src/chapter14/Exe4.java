package chapter14;

import java.util.Arrays;
import java.util.List;

public class Exe4 {
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
		for (Shape shape : shapeList) {
			shape.draw();
		}
		Rhomboid r = new Rhomboid();
		//向上转型
		Shape s = (Shape)r;
		s.draw();
		if(s instanceof Circle) {
			((Circle)s).draw();
		}else if(!(s instanceof Circle)) {
			System.out.println("(Shape)r is not a Circle");
		}
	}
}
