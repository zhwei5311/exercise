package chapter8;

public class ExtendNoFunction extends NoFunction {
	
	public ExtendNoFunction() {
		System.out.println("�����๹����");
	}
	public void print() {
		System.out.println("��������ӵ�һ��������");
	}
	
	public static void fun(NoFunction noFunction) {
		noFunction = new ExtendNoFunction();
		System.out.println("��̬����");
		((ExtendNoFunction) noFunction).fun(noFunction);
	}
	@Override
	void f() {
		
		
	}
}
