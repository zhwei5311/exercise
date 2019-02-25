package chapter15;

public class CovariantArrays {
	public static void main(String[] args) {
		Fruit[] fruit = new Apple[10];
//		Fruit[] fruits = new Fruit[5];
		fruit[0] = new Apple();
		fruit[1] = new Jonathan();
//		fruits[0] = new Fruit();
	}
}
