package chapter12;

public class Exe10 {
	public static void f() {
		try {
			g();
		} catch (Exception1 e) {

			e.printStackTrace();
			try {
				throw new RuntimeException();
			} catch (RuntimeException e1) {

				e1.printStackTrace(System.out);
			}
		}
	}

	public static void g() throws Exception1 {
		throw new Exception1();
	}

	public static void main(String[] args) {
		f();
	}
}
