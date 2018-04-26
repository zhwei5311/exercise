package chapter12;

//定义一个对象引用并初始化为null，尝试用此引用调用方法。
//把这个调用放在try-catch子句中，对这个新异常进行测试。
public class Exe2 extends Exception {
	public static Integer i = null;
	public static void main(String[] args) {
		try {
			i.toString();
			throw new NullPointerException();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
}
