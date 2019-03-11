package chapter9;

public class ExtendsAbstract extends AbstractClass {

	@Override
	public void a() {
		System.out.println("ExtendsAbstract.a()");
	}
	
	public void b(AbstractClass ab) {
		System.out.println("b()");
	}
	
	public static void main(String[] args) {
		ExtendsAbstract extendsAbstract = new ExtendsAbstract();
		extendsAbstract.b(extendsAbstract);
	}

}
