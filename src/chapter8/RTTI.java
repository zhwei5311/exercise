package chapter8;

public class RTTI {
	public static void main(String[] args) {
		Useful[] x = {
				new Useful(),
				new MoreUseful()
		};
		x[0].f();
		x[1].g();
		x[0].g();
		((MoreUseful) x[1]).u();//����ת�ͣ�RTTI:Runtime type information/����ʱ����ʶ��
		((MoreUseful) x[0]).u();
	}
}
