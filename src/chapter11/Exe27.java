package chapter11;

import java.util.Queue;

/**
 * дһ����ΪCommand���࣬������һ��String���һ����ʾ��String��operation()������
 * д�ڶ����࣬������һ��ʹ��Command���������һ��Queue�������������ķ�����
 * �������Queue���ݸ����������һ���������÷������ĵ�Queue�еĶ���
 * ���������ǵ�operation()������
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
