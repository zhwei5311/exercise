package chapter12;

public class Exe4 extends Exception {
	private static String msg;
	public Exe4(){}
	public Exe4(String smg) {
		super(msg);
		this.msg = msg;
	}
	public void show() {
		System.out.println("show msg: " + msg);
	}
	public static void main(String[] args) {
		try {
			throw new Exe4("出现异常！");
		} catch (Exe4 e) {
			e.printStackTrace(System.out);
			e.show();
		}
	}
}
