package chapter8;

public class ExtendNoFunction extends NoFunction {
	
	public ExtendNoFunction() {
		System.out.println("导出类构造器");
	}
	public void print() {
		System.out.println("导出类添加的一个方法！");
	}
	
	public static void fun(NoFunction noFunction) {
		noFunction = new ExtendNoFunction();
		System.out.println("静态方法");
		((ExtendNoFunction) noFunction).fun(noFunction);
	}
	@Override
	void f() {
		
		
	}
}
