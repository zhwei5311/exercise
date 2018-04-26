package chapter11;

import java.util.LinkedList;
import java.util.Queue;
/**
 * 使用Command对象来填充一个Queue并返回这个对象
 * @author zhwei
 *
 */
public class Exes27 {
	public Queue<Command> get() {
		Queue<Command> queue = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			queue.offer(new Command(i + " "));
		}
		return queue;
	}
}
