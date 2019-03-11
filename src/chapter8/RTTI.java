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
		((MoreUseful) x[1]).u();//向下转型（RTTI:Runtime type information/运行时类型识别）
		((MoreUseful) x[0]).u();
	}
}
