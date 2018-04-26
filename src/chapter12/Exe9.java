package chapter12;

public class Exe9 {
	public static void f() throws Exception1,Exception2,Exception3 {
		System.out.println("抛出三种不同的异常！");
	}
	public static void main(String[] args) {
		try {
			f();
		} catch (Exception e) {
			e.printStackTrace(System.out);
			System.out.println("catch中抛出的异常！");
		}
	}
}
