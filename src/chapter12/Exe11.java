package chapter12;

public class Exe11 {
	public static void f() {
		try {
			g();
		} catch (Exception1 e) {

			e.printStackTrace();
			try {
				throw new Exception2();
			} catch (Exception2 e1) {

				e1.printStackTrace();
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
