package chapter8;

public class TestDerived {
	public static void main(String[] args) {
		ContainTwo c = new Derived();
		c.prints();
	}
}
//������Derived.print() is running
//ԭ��:������̳��˻�������ж�����û����д�ķ�������������
//��ʵ��Derived�л���������void prints()��������������������д��callprint()
//��Derived����prints()���������͵�����������д��callprint()������
//��������û��෽����ʵ������ĵ��ã����ǵ�������̳��Ի���ķ�����
// ֻ�����������û��дʱ���ڲ���ʽ�������ͬ
