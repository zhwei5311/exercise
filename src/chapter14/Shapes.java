package chapter14;

import java.util.*;
import java.util.Arrays;

public class Shapes {
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(),
				new Square(), new Triangle(), new Rhomboid());
		for(Shape shape:shapeList) {
			shape.draw();
		}
		Rhomboid r = new Rhomboid();
		((Shape)r).draw();//exercise 3
		//不能将其转换为该类型
//		((Circle)r).draw();
		//Rhomboid向上转型为Shape
		Shape shape = new Rhomboid();//exercise 3
		//Shape向下转型为Rhomboid
		Rhomboid r1 = (Rhomboid)shape;//exercise 3
		
		
	}
}
