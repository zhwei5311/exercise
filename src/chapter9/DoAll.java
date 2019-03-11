package chapter9;

public class DoAll extends Monster implements First,Second,Third {

	@Override
	public void function1() {
		System.out.println("function1()");
	}

	@Override
	public void function2() {
		System.out.println("function2()");
	}

	@Override
	public void kill() {
		System.out.println("kill()");
	}

	@Override
	public void destroy() {
		System.out.println("destory()");
	}

	@Override
	public void menace() {
		System.out.println("menace()");
	}

	@Override
	public void menaces() {
		System.out.println("menaces()");
	}
	
	public void doFirst(First f) {
		System.out.println("doFirst()");
	}
	
	public void doSecond(Second s) {
		System.out.println("doSecond()");
	}
	
	public void doThird(Third t) {
		System.out.println("doThird()");
	}
	
	public void doMonster(Monster m) {
		System.out.println("doMonster()");
	}
	
	public static void main(String[] args) {
		DoAll doAll = new DoAll();
		doAll.doFirst(doAll);
		doAll.doSecond(doAll);
		doAll.doThird(doAll);
		doAll.doMonster(doAll);
	}

}
