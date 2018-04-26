package chapter12;

//定义一个类，令其方法抛出在练习2里定义的异常；
//不用异常说明，看看能否通过编译；
//然后加上异常说明，用try-catch子句测试该类和异常。
public class Exe8 {
	static void f() throws Exe2 {
		throw new Exe2();
	}
	public static void main(String[] args) {
		try {
			f();
		} catch (Exception e) {
			e.printStackTrace(System.out);
			System.err.println("OK");
		}
	}
}
