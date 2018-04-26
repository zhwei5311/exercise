package chapter12;

//创建两个异常类，每一个都自动记录他们自己的日志，演示他们都可以正常运行
public class Exe6 {
	public static void main(String[] args) {
		try {
			throw new Exe6_1();
		} catch (Exe6_1 e) {
			e.printStackTrace(System.out);
		}
	}
}
