package chapter8;

public class Cycle {
	public String name;
	
	public Cycle(String name) {
		this.name = name;
	}
	public static void ride(Cycle c) {
		System.out.println(c.name + "is ridding");
	}
	public void wheels(int i) {
		System.out.println("ÊýÁ¿Îª£º" + i);
	}
}
