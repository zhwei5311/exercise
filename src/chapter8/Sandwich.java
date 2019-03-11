package chapter8;

public class Sandwich extends PortableLunch implements FastFood {
	private Bread bread = new Bread();
	private Cheese cheese = new Cheese();
	private Lettuce lettuce = new Lettuce();
	private Pickle pickle = new Pickle();
	public Sandwich() {
		System.out.println("Sandwich()");
	}
	
	public void eat() {
		System.out.println("实现FastFood接口的eat()方法");
	}
	
	public static void main(String[] args) {
		new Sandwich().eat();
	}
}
