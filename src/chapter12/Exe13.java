package chapter12;

public class Exe13 {
	public static void f(String s) throws Exception1, Exception2, Exception3 {
		if(s == null) {
			throw new NullPointerException();
		}
		System.out.println("抛出三种不同的异常！");
	}

	public static void main(String[] args) {
		try {
			f("");
		} catch (Exception e) {
			e.printStackTrace(System.out);
			System.out.println("catch中抛出的异常！");
		} finally {
			System.out.println("即使抛出NullPointerExceptionyichang ,finally子句依然得到执行");
		}
	}
}
