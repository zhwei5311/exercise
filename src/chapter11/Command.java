package chapter11;
/**
 * 写一个称为Command的类，它包含一个String域和一个显示该String的operation()方法
 * @author zhwei
 *
 */
public class Command {
	String s = new String();
	public Command(String s) {
		this.s = s;
	}
	public void operation() {
		System.out.println(s);
	}
}
