package chapter8;

public class Test4 {
	public static void main(String[] args) {
		NoFunction noFunction = new ExtendNoFunction();
		((ExtendNoFunction) noFunction).fun(noFunction);
//		ExtendNoFunction e = new ExtendNoFunction();
//		e.fun(e);
	}
}
