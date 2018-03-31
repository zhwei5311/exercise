package chapter11;

import java.util.ArrayList;

public class GenericsAndUpcasting {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Breaburn());
		for (int i = 0; i < apples.size(); i++) {
			System.out.println(apples.get(i).id());
		}
		for(Apple apple : apples) {
			System.out.println(apple);
		}
	}
}
