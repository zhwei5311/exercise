package chapter15;

public class Exe26 {
	public static void main(String[] args) {
		Number[] number = new Integer[3];
		number[0] = new Integer(0);
		number[1] = new Integer(1);
//		number[2] = new Double(3.3);
		for(Number n : number) {
			System.out.println(n.getClass().getSimpleName());
		}
	}
}
