package chapter11;

import java.util.Queue;

/**
 * 写一个称为Command的类，它包含一个String域和一个显示该String的operation()方法。
 * 写第二个类，它具有一个使用Command对象来填充一个Queue并返回这个对象的方法。
 * 将填充后的Queue传递给第三个类的一个方法，该方法消耗掉Queue中的对象，
 * 并调用它们的operation()方法。
 * @author zhwei
 *
 */
public class Exe27 {
	public static void getCommand(Queue<Command> qc) {
		while(qc.peek() != null) {
			qc.poll().operation();
		}
	}
	public static void main(String[] args) {
		Exes27 e = new Exes27();
		getCommand(e.get());
	}
}
